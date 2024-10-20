/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author nobpe
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.SecureRandom;

public class AccountGenerator {
    private static final int ACCOUNT_LENGTH = 12; // Độ dài của số tài khoản
    private static final SecureRandom random = new SecureRandom();

    // Hàm generate số tài khoản
    public static String generateUniqueAccountNumber(Connection connection) throws SQLException {
        String accountNumber;

        do {
            accountNumber = generateAccountNumber();  // Sinh số tài khoản ngẫu nhiên
        } while (doesAccountExist(connection, accountNumber)); // Kiểm tra tính duy nhất

        return accountNumber;
    }

    // Sinh số tài khoản ngẫu nhiên
    private static String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();

        // Sinh một chuỗi số ngẫu nhiên với độ dài ACCOUNT_LENGTH
        for (int i = 0; i < ACCOUNT_LENGTH; i++) {
            int digit = random.nextInt(10); // Tạo số từ 0 đến 9
            accountNumber.append(digit);
        }

        return accountNumber.toString();
    }

    // Kiểm tra số tài khoản đã tồn tại trong cơ sở dữ liệu hay chưa
    private static boolean doesAccountExist(Connection connection, String accountNumber) throws SQLException {
        String sql = "SELECT COUNT(*) FROM tai_khoan_nguoi_dung WHERE so_tai_khoan = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, accountNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; // Nếu số tài khoản đã tồn tại
                }
            }
        }
        return false; // Không tồn tại số tài khoản
    }
}

