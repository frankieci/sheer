package com.springboot.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetSDWeeklyReportDataRespDTO {
  private List<Header> headerList;
  private List<Body> bodyList;
  private String lastModifyDate;

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  public static class Header {
    private String week;
    private String startDate;
    private String endDate;
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  public static class Body {
    private String brand;
    private String dataType;

    private Float wk01;
    private Float wk02;
    private Float wk03;
    private Float wk04;
    private Float wk05;
    private Float wk06;
    private Float wk07;
    private Float wk08;
    private Float wk09;
    private Float wk10;
    private Float wk11;
    private Float wk12;
    private Float wk13;

  }
}
