package com.insure.service;

import java.sql.SQLException;
import java.util.List;

import com.insure.model.Insurance;

public interface InsuranceService {
List<Insurance> getInsurances() throws ClassNotFoundException, SQLException;
}
