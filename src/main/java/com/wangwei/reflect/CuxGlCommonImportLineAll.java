package com.wangwei.reflect;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CuxGlCommonImportLineAll implements Serializable {
    private Long lineId;

    private String source;

    private String sourceCategory;

    private Long sourceBatchId;

    private Long sourceLineId;

    private Long sourceLineNum;

    private String status;

    private String errorMessage;

    private Long requestId;

    private Long batchId;

    private Long groupId;

    private Long jeHeaderId;

    private String jeJournalName;

    private Long jeLineNum;

    private Long cuxHeaderId;

    private Long cuxHeaderRn;

    private Long ledgerId;

    private String jeSourceName;

    private String jeCategoryName;

    private String userJeSourceName;

    private String userJeCategoryName;

    private String periodName;

    private Date glDate;

    private String currencyCode;

    private String exchangeRateType;

    private Date exchangeRateDate;

    private Long exchangeRate;

    private String journalName;

    private String journalDescription;

    private String journalReference;

    private Long headerAttrValue;

    private String lineDescription;

    private BigDecimal enteredDr;

    private BigDecimal enteredCr;

    private BigDecimal accountedDr;

    private BigDecimal accountedCr;

    private Long codeCombinationId;

    private String segment1;

    private String segment2;

    private String segment3;

    private String segment4;

    private String segment5;

    private String segment6;

    private String segment7;

    private String segment8;

    private String segment9;

    private Long chartOfAccountsId;

    private String glSlLinkTable;

    private Long glSlLinkId;

    private String headerContext;

    private String headerAttribute1;

    private String headerAttribute2;

    private String headerAttribute3;

    private String headerAttribute4;

    private String headerAttribute5;

    private String headerAttribute6;

    private String headerAttribute7;

    private String headerAttribute8;

    private String headerAttribute9;

    private String headerAttribute10;

    private String headerAttribute11;

    private String headerAttribute12;

    private String headerAttribute13;

    private String headerAttribute14;

    private String headerAttribute15;

    private String lineContext;

    private String lineAttribute1;

    private String lineAttribute2;

    private String lineAttribute3;

    private String lineAttribute4;

    private String lineAttribute5;

    private String lineAttribute6;

    private String lineAttribute7;

    private String lineAttribute8;

    private String lineAttribute9;

    private String lineAttribute10;

    private String lineAttribute11;

    private String lineAttribute12;

    private String lineAttribute13;

    private String lineAttribute14;

    private String lineAttribute15;

    private String shInterOrgName;

    private String createUserMis;

    private String updateUserMis;

    private Long createdBy;

    private Date creationDate;

    private Long lastUpdatedBy;

    private Date lastUpdateDate;

    private Long lastUpdateLogin;

    private static final long serialVersionUID = 1L;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourceCategory() {
        return sourceCategory;
    }

    public void setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory == null ? null : sourceCategory.trim();
    }

    public Long getSourceBatchId() {
        return sourceBatchId;
    }

    public void setSourceBatchId(Long sourceBatchId) {
        this.sourceBatchId = sourceBatchId;
    }

    public Long getSourceLineId() {
        return sourceLineId;
    }

    public void setSourceLineId(Long sourceLineId) {
        this.sourceLineId = sourceLineId;
    }

    public Long getSourceLineNum() {
        return sourceLineNum;
    }

    public void setSourceLineNum(Long sourceLineNum) {
        this.sourceLineNum = sourceLineNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getJeHeaderId() {
        return jeHeaderId;
    }

    public void setJeHeaderId(Long jeHeaderId) {
        this.jeHeaderId = jeHeaderId;
    }

    public String getJeJournalName() {
        return jeJournalName;
    }

    public void setJeJournalName(String jeJournalName) {
        this.jeJournalName = jeJournalName == null ? null : jeJournalName.trim();
    }

    public Long getJeLineNum() {
        return jeLineNum;
    }

    public void setJeLineNum(Long jeLineNum) {
        this.jeLineNum = jeLineNum;
    }

    public Long getCuxHeaderId() {
        return cuxHeaderId;
    }

    public void setCuxHeaderId(Long cuxHeaderId) {
        this.cuxHeaderId = cuxHeaderId;
    }

    public Long getCuxHeaderRn() {
        return cuxHeaderRn;
    }

    public void setCuxHeaderRn(Long cuxHeaderRn) {
        this.cuxHeaderRn = cuxHeaderRn;
    }

    public Long getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(Long ledgerId) {
        this.ledgerId = ledgerId;
    }

    public String getJeSourceName() {
        return jeSourceName;
    }

    public void setJeSourceName(String jeSourceName) {
        this.jeSourceName = jeSourceName == null ? null : jeSourceName.trim();
    }

    public String getJeCategoryName() {
        return jeCategoryName;
    }

    public void setJeCategoryName(String jeCategoryName) {
        this.jeCategoryName = jeCategoryName == null ? null : jeCategoryName.trim();
    }

    public String getUserJeSourceName() {
        return userJeSourceName;
    }

    public void setUserJeSourceName(String userJeSourceName) {
        this.userJeSourceName = userJeSourceName == null ? null : userJeSourceName.trim();
    }

    public String getUserJeCategoryName() {
        return userJeCategoryName;
    }

    public void setUserJeCategoryName(String userJeCategoryName) {
        this.userJeCategoryName = userJeCategoryName == null ? null : userJeCategoryName.trim();
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName == null ? null : periodName.trim();
    }

    public Date getGlDate() {
        return glDate;
    }

    public void setGlDate(Date glDate) {
        this.glDate = glDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getExchangeRateType() {
        return exchangeRateType;
    }

    public void setExchangeRateType(String exchangeRateType) {
        this.exchangeRateType = exchangeRateType == null ? null : exchangeRateType.trim();
    }

    public Date getExchangeRateDate() {
        return exchangeRateDate;
    }

    public void setExchangeRateDate(Date exchangeRateDate) {
        this.exchangeRateDate = exchangeRateDate;
    }

    public Long getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName == null ? null : journalName.trim();
    }

    public String getJournalDescription() {
        return journalDescription;
    }

    public void setJournalDescription(String journalDescription) {
        this.journalDescription = journalDescription == null ? null : journalDescription.trim();
    }

    public String getJournalReference() {
        return journalReference;
    }

    public void setJournalReference(String journalReference) {
        this.journalReference = journalReference == null ? null : journalReference.trim();
    }

    public Long getHeaderAttrValue() {
        return headerAttrValue;
    }

    public void setHeaderAttrValue(Long headerAttrValue) {
        this.headerAttrValue = headerAttrValue;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription == null ? null : lineDescription.trim();
    }

    public BigDecimal getEnteredDr() {
        return enteredDr;
    }

    public void setEnteredDr(BigDecimal enteredDr) {
        this.enteredDr = enteredDr;
    }

    public BigDecimal getEnteredCr() {
        return enteredCr;
    }

    public void setEnteredCr(BigDecimal enteredCr) {
        this.enteredCr = enteredCr;
    }

    public BigDecimal getAccountedDr() {
        return accountedDr;
    }

    public void setAccountedDr(BigDecimal accountedDr) {
        this.accountedDr = accountedDr;
    }

    public BigDecimal getAccountedCr() {
        return accountedCr;
    }

    public void setAccountedCr(BigDecimal accountedCr) {
        this.accountedCr = accountedCr;
    }

    public Long getCodeCombinationId() {
        return codeCombinationId;
    }

    public void setCodeCombinationId(Long codeCombinationId) {
        this.codeCombinationId = codeCombinationId;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1 == null ? null : segment1.trim();
    }

    public String getSegment2() {
        return segment2;
    }

    public void setSegment2(String segment2) {
        this.segment2 = segment2 == null ? null : segment2.trim();
    }

    public String getSegment3() {
        return segment3;
    }

    public void setSegment3(String segment3) {
        this.segment3 = segment3 == null ? null : segment3.trim();
    }

    public String getSegment4() {
        return segment4;
    }

    public void setSegment4(String segment4) {
        this.segment4 = segment4 == null ? null : segment4.trim();
    }

    public String getSegment5() {
        return segment5;
    }

    public void setSegment5(String segment5) {
        this.segment5 = segment5 == null ? null : segment5.trim();
    }

    public String getSegment6() {
        return segment6;
    }

    public void setSegment6(String segment6) {
        this.segment6 = segment6 == null ? null : segment6.trim();
    }

    public String getSegment7() {
        return segment7;
    }

    public void setSegment7(String segment7) {
        this.segment7 = segment7 == null ? null : segment7.trim();
    }

    public String getSegment8() {
        return segment8;
    }

    public void setSegment8(String segment8) {
        this.segment8 = segment8 == null ? null : segment8.trim();
    }

    public String getSegment9() {
        return segment9;
    }

    public void setSegment9(String segment9) {
        this.segment9 = segment9 == null ? null : segment9.trim();
    }

    public Long getChartOfAccountsId() {
        return chartOfAccountsId;
    }

    public void setChartOfAccountsId(Long chartOfAccountsId) {
        this.chartOfAccountsId = chartOfAccountsId;
    }

    public String getGlSlLinkTable() {
        return glSlLinkTable;
    }

    public void setGlSlLinkTable(String glSlLinkTable) {
        this.glSlLinkTable = glSlLinkTable == null ? null : glSlLinkTable.trim();
    }

    public Long getGlSlLinkId() {
        return glSlLinkId;
    }

    public void setGlSlLinkId(Long glSlLinkId) {
        this.glSlLinkId = glSlLinkId;
    }

    public String getHeaderContext() {
        return headerContext;
    }

    public void setHeaderContext(String headerContext) {
        this.headerContext = headerContext == null ? null : headerContext.trim();
    }

    public String getHeaderAttribute1() {
        return headerAttribute1;
    }

    public void setHeaderAttribute1(String headerAttribute1) {
        this.headerAttribute1 = headerAttribute1 == null ? null : headerAttribute1.trim();
    }

    public String getHeaderAttribute2() {
        return headerAttribute2;
    }

    public void setHeaderAttribute2(String headerAttribute2) {
        this.headerAttribute2 = headerAttribute2 == null ? null : headerAttribute2.trim();
    }

    public String getHeaderAttribute3() {
        return headerAttribute3;
    }

    public void setHeaderAttribute3(String headerAttribute3) {
        this.headerAttribute3 = headerAttribute3 == null ? null : headerAttribute3.trim();
    }

    public String getHeaderAttribute4() {
        return headerAttribute4;
    }

    public void setHeaderAttribute4(String headerAttribute4) {
        this.headerAttribute4 = headerAttribute4 == null ? null : headerAttribute4.trim();
    }

    public String getHeaderAttribute5() {
        return headerAttribute5;
    }

    public void setHeaderAttribute5(String headerAttribute5) {
        this.headerAttribute5 = headerAttribute5 == null ? null : headerAttribute5.trim();
    }

    public String getHeaderAttribute6() {
        return headerAttribute6;
    }

    public void setHeaderAttribute6(String headerAttribute6) {
        this.headerAttribute6 = headerAttribute6 == null ? null : headerAttribute6.trim();
    }

    public String getHeaderAttribute7() {
        return headerAttribute7;
    }

    public void setHeaderAttribute7(String headerAttribute7) {
        this.headerAttribute7 = headerAttribute7 == null ? null : headerAttribute7.trim();
    }

    public String getHeaderAttribute8() {
        return headerAttribute8;
    }

    public void setHeaderAttribute8(String headerAttribute8) {
        this.headerAttribute8 = headerAttribute8 == null ? null : headerAttribute8.trim();
    }

    public String getHeaderAttribute9() {
        return headerAttribute9;
    }

    public void setHeaderAttribute9(String headerAttribute9) {
        this.headerAttribute9 = headerAttribute9 == null ? null : headerAttribute9.trim();
    }

    public String getHeaderAttribute10() {
        return headerAttribute10;
    }

    public void setHeaderAttribute10(String headerAttribute10) {
        this.headerAttribute10 = headerAttribute10 == null ? null : headerAttribute10.trim();
    }

    public String getHeaderAttribute11() {
        return headerAttribute11;
    }

    public void setHeaderAttribute11(String headerAttribute11) {
        this.headerAttribute11 = headerAttribute11 == null ? null : headerAttribute11.trim();
    }

    public String getHeaderAttribute12() {
        return headerAttribute12;
    }

    public void setHeaderAttribute12(String headerAttribute12) {
        this.headerAttribute12 = headerAttribute12 == null ? null : headerAttribute12.trim();
    }

    public String getHeaderAttribute13() {
        return headerAttribute13;
    }

    public void setHeaderAttribute13(String headerAttribute13) {
        this.headerAttribute13 = headerAttribute13 == null ? null : headerAttribute13.trim();
    }

    public String getHeaderAttribute14() {
        return headerAttribute14;
    }

    public void setHeaderAttribute14(String headerAttribute14) {
        this.headerAttribute14 = headerAttribute14 == null ? null : headerAttribute14.trim();
    }

    public String getHeaderAttribute15() {
        return headerAttribute15;
    }

    public void setHeaderAttribute15(String headerAttribute15) {
        this.headerAttribute15 = headerAttribute15 == null ? null : headerAttribute15.trim();
    }

    public String getLineContext() {
        return lineContext;
    }

    public void setLineContext(String lineContext) {
        this.lineContext = lineContext == null ? null : lineContext.trim();
    }

    public String getLineAttribute1() {
        return lineAttribute1;
    }

    public void setLineAttribute1(String lineAttribute1) {
        this.lineAttribute1 = lineAttribute1 == null ? null : lineAttribute1.trim();
    }

    public String getLineAttribute2() {
        return lineAttribute2;
    }

    public void setLineAttribute2(String lineAttribute2) {
        this.lineAttribute2 = lineAttribute2 == null ? null : lineAttribute2.trim();
    }

    public String getLineAttribute3() {
        return lineAttribute3;
    }

    public void setLineAttribute3(String lineAttribute3) {
        this.lineAttribute3 = lineAttribute3 == null ? null : lineAttribute3.trim();
    }

    public String getLineAttribute4() {
        return lineAttribute4;
    }

    public void setLineAttribute4(String lineAttribute4) {
        this.lineAttribute4 = lineAttribute4 == null ? null : lineAttribute4.trim();
    }

    public String getLineAttribute5() {
        return lineAttribute5;
    }

    public void setLineAttribute5(String lineAttribute5) {
        this.lineAttribute5 = lineAttribute5 == null ? null : lineAttribute5.trim();
    }

    public String getLineAttribute6() {
        return lineAttribute6;
    }

    public void setLineAttribute6(String lineAttribute6) {
        this.lineAttribute6 = lineAttribute6 == null ? null : lineAttribute6.trim();
    }

    public String getLineAttribute7() {
        return lineAttribute7;
    }

    public void setLineAttribute7(String lineAttribute7) {
        this.lineAttribute7 = lineAttribute7 == null ? null : lineAttribute7.trim();
    }

    public String getLineAttribute8() {
        return lineAttribute8;
    }

    public void setLineAttribute8(String lineAttribute8) {
        this.lineAttribute8 = lineAttribute8 == null ? null : lineAttribute8.trim();
    }

    public String getLineAttribute9() {
        return lineAttribute9;
    }

    public void setLineAttribute9(String lineAttribute9) {
        this.lineAttribute9 = lineAttribute9 == null ? null : lineAttribute9.trim();
    }

    public String getLineAttribute10() {
        return lineAttribute10;
    }

    public void setLineAttribute10(String lineAttribute10) {
        this.lineAttribute10 = lineAttribute10 == null ? null : lineAttribute10.trim();
    }

    public String getLineAttribute11() {
        return lineAttribute11;
    }

    public void setLineAttribute11(String lineAttribute11) {
        this.lineAttribute11 = lineAttribute11 == null ? null : lineAttribute11.trim();
    }

    public String getLineAttribute12() {
        return lineAttribute12;
    }

    public void setLineAttribute12(String lineAttribute12) {
        this.lineAttribute12 = lineAttribute12 == null ? null : lineAttribute12.trim();
    }

    public String getLineAttribute13() {
        return lineAttribute13;
    }

    public void setLineAttribute13(String lineAttribute13) {
        this.lineAttribute13 = lineAttribute13 == null ? null : lineAttribute13.trim();
    }

    public String getLineAttribute14() {
        return lineAttribute14;
    }

    public void setLineAttribute14(String lineAttribute14) {
        this.lineAttribute14 = lineAttribute14 == null ? null : lineAttribute14.trim();
    }

    public String getLineAttribute15() {
        return lineAttribute15;
    }

    public void setLineAttribute15(String lineAttribute15) {
        this.lineAttribute15 = lineAttribute15 == null ? null : lineAttribute15.trim();
    }

    public String getShInterOrgName() {
        return shInterOrgName;
    }

    public void setShInterOrgName(String shInterOrgName) {
        this.shInterOrgName = shInterOrgName == null ? null : shInterOrgName.trim();
    }

    public String getCreateUserMis() {
        return createUserMis;
    }

    public void setCreateUserMis(String createUserMis) {
        this.createUserMis = createUserMis == null ? null : createUserMis.trim();
    }

    public String getUpdateUserMis() {
        return updateUserMis;
    }

    public void setUpdateUserMis(String updateUserMis) {
        this.updateUserMis = updateUserMis == null ? null : updateUserMis.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lineId=").append(lineId);
        sb.append(", source=").append(source);
        sb.append(", sourceCategory=").append(sourceCategory);
        sb.append(", sourceBatchId=").append(sourceBatchId);
        sb.append(", sourceLineId=").append(sourceLineId);
        sb.append(", sourceLineNum=").append(sourceLineNum);
        sb.append(", status=").append(status);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", requestId=").append(requestId);
        sb.append(", batchId=").append(batchId);
        sb.append(", groupId=").append(groupId);
        sb.append(", jeHeaderId=").append(jeHeaderId);
        sb.append(", jeJournalName=").append(jeJournalName);
        sb.append(", jeLineNum=").append(jeLineNum);
        sb.append(", cuxHeaderId=").append(cuxHeaderId);
        sb.append(", cuxHeaderRn=").append(cuxHeaderRn);
        sb.append(", ledgerId=").append(ledgerId);
        sb.append(", jeSourceName=").append(jeSourceName);
        sb.append(", jeCategoryName=").append(jeCategoryName);
        sb.append(", userJeSourceName=").append(userJeSourceName);
        sb.append(", userJeCategoryName=").append(userJeCategoryName);
        sb.append(", periodName=").append(periodName);
        sb.append(", glDate=").append(glDate);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", exchangeRateType=").append(exchangeRateType);
        sb.append(", exchangeRateDate=").append(exchangeRateDate);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", journalName=").append(journalName);
        sb.append(", journalDescription=").append(journalDescription);
        sb.append(", journalReference=").append(journalReference);
        sb.append(", headerAttrValue=").append(headerAttrValue);
        sb.append(", lineDescription=").append(lineDescription);
        sb.append(", enteredDr=").append(enteredDr);
        sb.append(", enteredCr=").append(enteredCr);
        sb.append(", accountedDr=").append(accountedDr);
        sb.append(", accountedCr=").append(accountedCr);
        sb.append(", codeCombinationId=").append(codeCombinationId);
        sb.append(", segment1=").append(segment1);
        sb.append(", segment2=").append(segment2);
        sb.append(", segment3=").append(segment3);
        sb.append(", segment4=").append(segment4);
        sb.append(", segment5=").append(segment5);
        sb.append(", segment6=").append(segment6);
        sb.append(", segment7=").append(segment7);
        sb.append(", segment8=").append(segment8);
        sb.append(", segment9=").append(segment9);
        sb.append(", chartOfAccountsId=").append(chartOfAccountsId);
        sb.append(", glSlLinkTable=").append(glSlLinkTable);
        sb.append(", glSlLinkId=").append(glSlLinkId);
        sb.append(", headerContext=").append(headerContext);
        sb.append(", headerAttribute1=").append(headerAttribute1);
        sb.append(", headerAttribute2=").append(headerAttribute2);
        sb.append(", headerAttribute3=").append(headerAttribute3);
        sb.append(", headerAttribute4=").append(headerAttribute4);
        sb.append(", headerAttribute5=").append(headerAttribute5);
        sb.append(", headerAttribute6=").append(headerAttribute6);
        sb.append(", headerAttribute7=").append(headerAttribute7);
        sb.append(", headerAttribute8=").append(headerAttribute8);
        sb.append(", headerAttribute9=").append(headerAttribute9);
        sb.append(", headerAttribute10=").append(headerAttribute10);
        sb.append(", headerAttribute11=").append(headerAttribute11);
        sb.append(", headerAttribute12=").append(headerAttribute12);
        sb.append(", headerAttribute13=").append(headerAttribute13);
        sb.append(", headerAttribute14=").append(headerAttribute14);
        sb.append(", headerAttribute15=").append(headerAttribute15);
        sb.append(", lineContext=").append(lineContext);
        sb.append(", lineAttribute1=").append(lineAttribute1);
        sb.append(", lineAttribute2=").append(lineAttribute2);
        sb.append(", lineAttribute3=").append(lineAttribute3);
        sb.append(", lineAttribute4=").append(lineAttribute4);
        sb.append(", lineAttribute5=").append(lineAttribute5);
        sb.append(", lineAttribute6=").append(lineAttribute6);
        sb.append(", lineAttribute7=").append(lineAttribute7);
        sb.append(", lineAttribute8=").append(lineAttribute8);
        sb.append(", lineAttribute9=").append(lineAttribute9);
        sb.append(", lineAttribute10=").append(lineAttribute10);
        sb.append(", lineAttribute11=").append(lineAttribute11);
        sb.append(", lineAttribute12=").append(lineAttribute12);
        sb.append(", lineAttribute13=").append(lineAttribute13);
        sb.append(", lineAttribute14=").append(lineAttribute14);
        sb.append(", lineAttribute15=").append(lineAttribute15);
        sb.append(", shInterOrgName=").append(shInterOrgName);
        sb.append(", createUserMis=").append(createUserMis);
        sb.append(", updateUserMis=").append(updateUserMis);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdatedBy=").append(lastUpdatedBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", lastUpdateLogin=").append(lastUpdateLogin);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CuxGlCommonImportLineAll other = (CuxGlCommonImportLineAll) that;
        return (this.getLineId() == null ? other.getLineId() == null : this.getLineId().equals(other.getLineId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getSourceCategory() == null ? other.getSourceCategory() == null : this.getSourceCategory().equals(other.getSourceCategory()))
            && (this.getSourceBatchId() == null ? other.getSourceBatchId() == null : this.getSourceBatchId().equals(other.getSourceBatchId()))
            && (this.getSourceLineId() == null ? other.getSourceLineId() == null : this.getSourceLineId().equals(other.getSourceLineId()))
            && (this.getSourceLineNum() == null ? other.getSourceLineNum() == null : this.getSourceLineNum().equals(other.getSourceLineNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getBatchId() == null ? other.getBatchId() == null : this.getBatchId().equals(other.getBatchId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getJeHeaderId() == null ? other.getJeHeaderId() == null : this.getJeHeaderId().equals(other.getJeHeaderId()))
            && (this.getJeJournalName() == null ? other.getJeJournalName() == null : this.getJeJournalName().equals(other.getJeJournalName()))
            && (this.getJeLineNum() == null ? other.getJeLineNum() == null : this.getJeLineNum().equals(other.getJeLineNum()))
            && (this.getCuxHeaderId() == null ? other.getCuxHeaderId() == null : this.getCuxHeaderId().equals(other.getCuxHeaderId()))
            && (this.getCuxHeaderRn() == null ? other.getCuxHeaderRn() == null : this.getCuxHeaderRn().equals(other.getCuxHeaderRn()))
            && (this.getLedgerId() == null ? other.getLedgerId() == null : this.getLedgerId().equals(other.getLedgerId()))
            && (this.getJeSourceName() == null ? other.getJeSourceName() == null : this.getJeSourceName().equals(other.getJeSourceName()))
            && (this.getJeCategoryName() == null ? other.getJeCategoryName() == null : this.getJeCategoryName().equals(other.getJeCategoryName()))
            && (this.getUserJeSourceName() == null ? other.getUserJeSourceName() == null : this.getUserJeSourceName().equals(other.getUserJeSourceName()))
            && (this.getUserJeCategoryName() == null ? other.getUserJeCategoryName() == null : this.getUserJeCategoryName().equals(other.getUserJeCategoryName()))
            && (this.getPeriodName() == null ? other.getPeriodName() == null : this.getPeriodName().equals(other.getPeriodName()))
            && (this.getGlDate() == null ? other.getGlDate() == null : this.getGlDate().equals(other.getGlDate()))
            && (this.getCurrencyCode() == null ? other.getCurrencyCode() == null : this.getCurrencyCode().equals(other.getCurrencyCode()))
            && (this.getExchangeRateType() == null ? other.getExchangeRateType() == null : this.getExchangeRateType().equals(other.getExchangeRateType()))
            && (this.getExchangeRateDate() == null ? other.getExchangeRateDate() == null : this.getExchangeRateDate().equals(other.getExchangeRateDate()))
            && (this.getExchangeRate() == null ? other.getExchangeRate() == null : this.getExchangeRate().equals(other.getExchangeRate()))
            && (this.getJournalName() == null ? other.getJournalName() == null : this.getJournalName().equals(other.getJournalName()))
            && (this.getJournalDescription() == null ? other.getJournalDescription() == null : this.getJournalDescription().equals(other.getJournalDescription()))
            && (this.getJournalReference() == null ? other.getJournalReference() == null : this.getJournalReference().equals(other.getJournalReference()))
            && (this.getHeaderAttrValue() == null ? other.getHeaderAttrValue() == null : this.getHeaderAttrValue().equals(other.getHeaderAttrValue()))
            && (this.getLineDescription() == null ? other.getLineDescription() == null : this.getLineDescription().equals(other.getLineDescription()))
            && (this.getEnteredDr() == null ? other.getEnteredDr() == null : this.getEnteredDr().equals(other.getEnteredDr()))
            && (this.getEnteredCr() == null ? other.getEnteredCr() == null : this.getEnteredCr().equals(other.getEnteredCr()))
            && (this.getAccountedDr() == null ? other.getAccountedDr() == null : this.getAccountedDr().equals(other.getAccountedDr()))
            && (this.getAccountedCr() == null ? other.getAccountedCr() == null : this.getAccountedCr().equals(other.getAccountedCr()))
            && (this.getCodeCombinationId() == null ? other.getCodeCombinationId() == null : this.getCodeCombinationId().equals(other.getCodeCombinationId()))
            && (this.getSegment1() == null ? other.getSegment1() == null : this.getSegment1().equals(other.getSegment1()))
            && (this.getSegment2() == null ? other.getSegment2() == null : this.getSegment2().equals(other.getSegment2()))
            && (this.getSegment3() == null ? other.getSegment3() == null : this.getSegment3().equals(other.getSegment3()))
            && (this.getSegment4() == null ? other.getSegment4() == null : this.getSegment4().equals(other.getSegment4()))
            && (this.getSegment5() == null ? other.getSegment5() == null : this.getSegment5().equals(other.getSegment5()))
            && (this.getSegment6() == null ? other.getSegment6() == null : this.getSegment6().equals(other.getSegment6()))
            && (this.getSegment7() == null ? other.getSegment7() == null : this.getSegment7().equals(other.getSegment7()))
            && (this.getSegment8() == null ? other.getSegment8() == null : this.getSegment8().equals(other.getSegment8()))
            && (this.getSegment9() == null ? other.getSegment9() == null : this.getSegment9().equals(other.getSegment9()))
            && (this.getChartOfAccountsId() == null ? other.getChartOfAccountsId() == null : this.getChartOfAccountsId().equals(other.getChartOfAccountsId()))
            && (this.getGlSlLinkTable() == null ? other.getGlSlLinkTable() == null : this.getGlSlLinkTable().equals(other.getGlSlLinkTable()))
            && (this.getGlSlLinkId() == null ? other.getGlSlLinkId() == null : this.getGlSlLinkId().equals(other.getGlSlLinkId()))
            && (this.getHeaderContext() == null ? other.getHeaderContext() == null : this.getHeaderContext().equals(other.getHeaderContext()))
            && (this.getHeaderAttribute1() == null ? other.getHeaderAttribute1() == null : this.getHeaderAttribute1().equals(other.getHeaderAttribute1()))
            && (this.getHeaderAttribute2() == null ? other.getHeaderAttribute2() == null : this.getHeaderAttribute2().equals(other.getHeaderAttribute2()))
            && (this.getHeaderAttribute3() == null ? other.getHeaderAttribute3() == null : this.getHeaderAttribute3().equals(other.getHeaderAttribute3()))
            && (this.getHeaderAttribute4() == null ? other.getHeaderAttribute4() == null : this.getHeaderAttribute4().equals(other.getHeaderAttribute4()))
            && (this.getHeaderAttribute5() == null ? other.getHeaderAttribute5() == null : this.getHeaderAttribute5().equals(other.getHeaderAttribute5()))
            && (this.getHeaderAttribute6() == null ? other.getHeaderAttribute6() == null : this.getHeaderAttribute6().equals(other.getHeaderAttribute6()))
            && (this.getHeaderAttribute7() == null ? other.getHeaderAttribute7() == null : this.getHeaderAttribute7().equals(other.getHeaderAttribute7()))
            && (this.getHeaderAttribute8() == null ? other.getHeaderAttribute8() == null : this.getHeaderAttribute8().equals(other.getHeaderAttribute8()))
            && (this.getHeaderAttribute9() == null ? other.getHeaderAttribute9() == null : this.getHeaderAttribute9().equals(other.getHeaderAttribute9()))
            && (this.getHeaderAttribute10() == null ? other.getHeaderAttribute10() == null : this.getHeaderAttribute10().equals(other.getHeaderAttribute10()))
            && (this.getHeaderAttribute11() == null ? other.getHeaderAttribute11() == null : this.getHeaderAttribute11().equals(other.getHeaderAttribute11()))
            && (this.getHeaderAttribute12() == null ? other.getHeaderAttribute12() == null : this.getHeaderAttribute12().equals(other.getHeaderAttribute12()))
            && (this.getHeaderAttribute13() == null ? other.getHeaderAttribute13() == null : this.getHeaderAttribute13().equals(other.getHeaderAttribute13()))
            && (this.getHeaderAttribute14() == null ? other.getHeaderAttribute14() == null : this.getHeaderAttribute14().equals(other.getHeaderAttribute14()))
            && (this.getHeaderAttribute15() == null ? other.getHeaderAttribute15() == null : this.getHeaderAttribute15().equals(other.getHeaderAttribute15()))
            && (this.getLineContext() == null ? other.getLineContext() == null : this.getLineContext().equals(other.getLineContext()))
            && (this.getLineAttribute1() == null ? other.getLineAttribute1() == null : this.getLineAttribute1().equals(other.getLineAttribute1()))
            && (this.getLineAttribute2() == null ? other.getLineAttribute2() == null : this.getLineAttribute2().equals(other.getLineAttribute2()))
            && (this.getLineAttribute3() == null ? other.getLineAttribute3() == null : this.getLineAttribute3().equals(other.getLineAttribute3()))
            && (this.getLineAttribute4() == null ? other.getLineAttribute4() == null : this.getLineAttribute4().equals(other.getLineAttribute4()))
            && (this.getLineAttribute5() == null ? other.getLineAttribute5() == null : this.getLineAttribute5().equals(other.getLineAttribute5()))
            && (this.getLineAttribute6() == null ? other.getLineAttribute6() == null : this.getLineAttribute6().equals(other.getLineAttribute6()))
            && (this.getLineAttribute7() == null ? other.getLineAttribute7() == null : this.getLineAttribute7().equals(other.getLineAttribute7()))
            && (this.getLineAttribute8() == null ? other.getLineAttribute8() == null : this.getLineAttribute8().equals(other.getLineAttribute8()))
            && (this.getLineAttribute9() == null ? other.getLineAttribute9() == null : this.getLineAttribute9().equals(other.getLineAttribute9()))
            && (this.getLineAttribute10() == null ? other.getLineAttribute10() == null : this.getLineAttribute10().equals(other.getLineAttribute10()))
            && (this.getLineAttribute11() == null ? other.getLineAttribute11() == null : this.getLineAttribute11().equals(other.getLineAttribute11()))
            && (this.getLineAttribute12() == null ? other.getLineAttribute12() == null : this.getLineAttribute12().equals(other.getLineAttribute12()))
            && (this.getLineAttribute13() == null ? other.getLineAttribute13() == null : this.getLineAttribute13().equals(other.getLineAttribute13()))
            && (this.getLineAttribute14() == null ? other.getLineAttribute14() == null : this.getLineAttribute14().equals(other.getLineAttribute14()))
            && (this.getLineAttribute15() == null ? other.getLineAttribute15() == null : this.getLineAttribute15().equals(other.getLineAttribute15()))
            && (this.getShInterOrgName() == null ? other.getShInterOrgName() == null : this.getShInterOrgName().equals(other.getShInterOrgName()))
            && (this.getCreateUserMis() == null ? other.getCreateUserMis() == null : this.getCreateUserMis().equals(other.getCreateUserMis()))
            && (this.getUpdateUserMis() == null ? other.getUpdateUserMis() == null : this.getUpdateUserMis().equals(other.getUpdateUserMis()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdatedBy() == null ? other.getLastUpdatedBy() == null : this.getLastUpdatedBy().equals(other.getLastUpdatedBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getLastUpdateLogin() == null ? other.getLastUpdateLogin() == null : this.getLastUpdateLogin().equals(other.getLastUpdateLogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLineId() == null) ? 0 : getLineId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getSourceCategory() == null) ? 0 : getSourceCategory().hashCode());
        result = prime * result + ((getSourceBatchId() == null) ? 0 : getSourceBatchId().hashCode());
        result = prime * result + ((getSourceLineId() == null) ? 0 : getSourceLineId().hashCode());
        result = prime * result + ((getSourceLineNum() == null) ? 0 : getSourceLineNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getBatchId() == null) ? 0 : getBatchId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getJeHeaderId() == null) ? 0 : getJeHeaderId().hashCode());
        result = prime * result + ((getJeJournalName() == null) ? 0 : getJeJournalName().hashCode());
        result = prime * result + ((getJeLineNum() == null) ? 0 : getJeLineNum().hashCode());
        result = prime * result + ((getCuxHeaderId() == null) ? 0 : getCuxHeaderId().hashCode());
        result = prime * result + ((getCuxHeaderRn() == null) ? 0 : getCuxHeaderRn().hashCode());
        result = prime * result + ((getLedgerId() == null) ? 0 : getLedgerId().hashCode());
        result = prime * result + ((getJeSourceName() == null) ? 0 : getJeSourceName().hashCode());
        result = prime * result + ((getJeCategoryName() == null) ? 0 : getJeCategoryName().hashCode());
        result = prime * result + ((getUserJeSourceName() == null) ? 0 : getUserJeSourceName().hashCode());
        result = prime * result + ((getUserJeCategoryName() == null) ? 0 : getUserJeCategoryName().hashCode());
        result = prime * result + ((getPeriodName() == null) ? 0 : getPeriodName().hashCode());
        result = prime * result + ((getGlDate() == null) ? 0 : getGlDate().hashCode());
        result = prime * result + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        result = prime * result + ((getExchangeRateType() == null) ? 0 : getExchangeRateType().hashCode());
        result = prime * result + ((getExchangeRateDate() == null) ? 0 : getExchangeRateDate().hashCode());
        result = prime * result + ((getExchangeRate() == null) ? 0 : getExchangeRate().hashCode());
        result = prime * result + ((getJournalName() == null) ? 0 : getJournalName().hashCode());
        result = prime * result + ((getJournalDescription() == null) ? 0 : getJournalDescription().hashCode());
        result = prime * result + ((getJournalReference() == null) ? 0 : getJournalReference().hashCode());
        result = prime * result + ((getHeaderAttrValue() == null) ? 0 : getHeaderAttrValue().hashCode());
        result = prime * result + ((getLineDescription() == null) ? 0 : getLineDescription().hashCode());
        result = prime * result + ((getEnteredDr() == null) ? 0 : getEnteredDr().hashCode());
        result = prime * result + ((getEnteredCr() == null) ? 0 : getEnteredCr().hashCode());
        result = prime * result + ((getAccountedDr() == null) ? 0 : getAccountedDr().hashCode());
        result = prime * result + ((getAccountedCr() == null) ? 0 : getAccountedCr().hashCode());
        result = prime * result + ((getCodeCombinationId() == null) ? 0 : getCodeCombinationId().hashCode());
        result = prime * result + ((getSegment1() == null) ? 0 : getSegment1().hashCode());
        result = prime * result + ((getSegment2() == null) ? 0 : getSegment2().hashCode());
        result = prime * result + ((getSegment3() == null) ? 0 : getSegment3().hashCode());
        result = prime * result + ((getSegment4() == null) ? 0 : getSegment4().hashCode());
        result = prime * result + ((getSegment5() == null) ? 0 : getSegment5().hashCode());
        result = prime * result + ((getSegment6() == null) ? 0 : getSegment6().hashCode());
        result = prime * result + ((getSegment7() == null) ? 0 : getSegment7().hashCode());
        result = prime * result + ((getSegment8() == null) ? 0 : getSegment8().hashCode());
        result = prime * result + ((getSegment9() == null) ? 0 : getSegment9().hashCode());
        result = prime * result + ((getChartOfAccountsId() == null) ? 0 : getChartOfAccountsId().hashCode());
        result = prime * result + ((getGlSlLinkTable() == null) ? 0 : getGlSlLinkTable().hashCode());
        result = prime * result + ((getGlSlLinkId() == null) ? 0 : getGlSlLinkId().hashCode());
        result = prime * result + ((getHeaderContext() == null) ? 0 : getHeaderContext().hashCode());
        result = prime * result + ((getHeaderAttribute1() == null) ? 0 : getHeaderAttribute1().hashCode());
        result = prime * result + ((getHeaderAttribute2() == null) ? 0 : getHeaderAttribute2().hashCode());
        result = prime * result + ((getHeaderAttribute3() == null) ? 0 : getHeaderAttribute3().hashCode());
        result = prime * result + ((getHeaderAttribute4() == null) ? 0 : getHeaderAttribute4().hashCode());
        result = prime * result + ((getHeaderAttribute5() == null) ? 0 : getHeaderAttribute5().hashCode());
        result = prime * result + ((getHeaderAttribute6() == null) ? 0 : getHeaderAttribute6().hashCode());
        result = prime * result + ((getHeaderAttribute7() == null) ? 0 : getHeaderAttribute7().hashCode());
        result = prime * result + ((getHeaderAttribute8() == null) ? 0 : getHeaderAttribute8().hashCode());
        result = prime * result + ((getHeaderAttribute9() == null) ? 0 : getHeaderAttribute9().hashCode());
        result = prime * result + ((getHeaderAttribute10() == null) ? 0 : getHeaderAttribute10().hashCode());
        result = prime * result + ((getHeaderAttribute11() == null) ? 0 : getHeaderAttribute11().hashCode());
        result = prime * result + ((getHeaderAttribute12() == null) ? 0 : getHeaderAttribute12().hashCode());
        result = prime * result + ((getHeaderAttribute13() == null) ? 0 : getHeaderAttribute13().hashCode());
        result = prime * result + ((getHeaderAttribute14() == null) ? 0 : getHeaderAttribute14().hashCode());
        result = prime * result + ((getHeaderAttribute15() == null) ? 0 : getHeaderAttribute15().hashCode());
        result = prime * result + ((getLineContext() == null) ? 0 : getLineContext().hashCode());
        result = prime * result + ((getLineAttribute1() == null) ? 0 : getLineAttribute1().hashCode());
        result = prime * result + ((getLineAttribute2() == null) ? 0 : getLineAttribute2().hashCode());
        result = prime * result + ((getLineAttribute3() == null) ? 0 : getLineAttribute3().hashCode());
        result = prime * result + ((getLineAttribute4() == null) ? 0 : getLineAttribute4().hashCode());
        result = prime * result + ((getLineAttribute5() == null) ? 0 : getLineAttribute5().hashCode());
        result = prime * result + ((getLineAttribute6() == null) ? 0 : getLineAttribute6().hashCode());
        result = prime * result + ((getLineAttribute7() == null) ? 0 : getLineAttribute7().hashCode());
        result = prime * result + ((getLineAttribute8() == null) ? 0 : getLineAttribute8().hashCode());
        result = prime * result + ((getLineAttribute9() == null) ? 0 : getLineAttribute9().hashCode());
        result = prime * result + ((getLineAttribute10() == null) ? 0 : getLineAttribute10().hashCode());
        result = prime * result + ((getLineAttribute11() == null) ? 0 : getLineAttribute11().hashCode());
        result = prime * result + ((getLineAttribute12() == null) ? 0 : getLineAttribute12().hashCode());
        result = prime * result + ((getLineAttribute13() == null) ? 0 : getLineAttribute13().hashCode());
        result = prime * result + ((getLineAttribute14() == null) ? 0 : getLineAttribute14().hashCode());
        result = prime * result + ((getLineAttribute15() == null) ? 0 : getLineAttribute15().hashCode());
        result = prime * result + ((getShInterOrgName() == null) ? 0 : getShInterOrgName().hashCode());
        result = prime * result + ((getCreateUserMis() == null) ? 0 : getCreateUserMis().hashCode());
        result = prime * result + ((getUpdateUserMis() == null) ? 0 : getUpdateUserMis().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getLastUpdateLogin() == null) ? 0 : getLastUpdateLogin().hashCode());
        return result;
    }
}