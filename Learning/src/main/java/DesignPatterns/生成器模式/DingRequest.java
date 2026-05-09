package DesignPatterns.生成器模式;



public class DingRequest {

    private String processCode;
    private String userId;
    private Long deptId;
    private String formData;
    private String ccList;
    private Boolean autoApprove;
    private String title;

    // 私有构造
    private DingRequest(Builder builder) {
        this.processCode = builder.processCode;
        this.userId = builder.userId;
        this.deptId = builder.deptId;
        this.formData = builder.formData;
        this.ccList = builder.ccList;
        this.autoApprove = builder.autoApprove;
        this.title = builder.title;
    }

    // getter（建议加上）
    public static class Builder {

        private String processCode;
        private String userId;
        private Long deptId;
        private String formData;
        private String ccList;
        private Boolean autoApprove;
        private String title;

        public Builder processCode(String processCode) {
            this.processCode = processCode;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder deptId(Long deptId) {
            this.deptId = deptId;
            return this;
        }

        public Builder formData(String formData) {
            this.formData = formData;
            return this;
        }

        public Builder ccList(String ccList) {
            this.ccList = ccList;
            return this;
        }

        public Builder autoApprove(Boolean autoApprove) {
            this.autoApprove = autoApprove;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DingRequest build() {
            // 👉 可以加校验（非常重要）
            if (processCode == null || userId == null) {
                throw new RuntimeException("必要参数不能为空");
            }
            return new DingRequest(this);
        }
    }
}