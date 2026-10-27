package com.moisecodes.schoolmis.repository.jdbc;

import com.moisecodes.schoolmis.repository.SchoolRepository;
import com.moisecodes.schoolmis.model.School;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class JdbcSchoolRepository implements SchoolRepository {

    @Override
    public Optional<School> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<School> findAll() {
        return List.of();
    }

    @Override
    public boolean update(School school) {
        return false;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public School save(School school) {
        return school;
    }
}
