package com.springboot.service;

import java.util.List;
import java.util.Map;

public interface ReportDataRepository {

  List<Map<String, Object>> getSDWeeklyReportData(String version, String brands);

  List<Map<String, Object>> getSDWeeklyReportHeader(String version);

}
