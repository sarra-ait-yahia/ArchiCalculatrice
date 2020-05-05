package modele;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OperationModel implements Serializable {
        private Double fisrtOperand, secondOperand;
        private String operation;
        private Double result;
        private String status;
        private int ErrorCode;


        public OperationModel(Double fisrtOperand, Double secondOperand, String operation) {
                this.fisrtOperand = fisrtOperand;
                this.secondOperand = secondOperand;
                this.operation = operation;
        }
        public Double getFisrtOperand() {
                return fisrtOperand;
        }
        public void setFisrtOperand(Double fisrtOperand) {
                this.fisrtOperand = fisrtOperand;
        }
        public Double getSecondOperand() {
                return secondOperand;
        }
        public void setSecondOperand(Double secondOperand) {
                this.secondOperand = secondOperand;
        }
        public String getOperation() {
                return operation;
        }
        public void setOperation(String operation) {
                this.operation = operation;
        }
        public Double getResult() {
                return result;
        }
        public void setResult(Double result) {
                this.result = result;
        }
        public String getStatus() {
                return status;
        }
        public void setStatus(String status) {
                this.status = status;
        }
        public int getErrorCode() {
                return ErrorCode;
        }
        public void setErrorCode(int i) {
                ErrorCode = i;
        }
        @Override
        public String toString() {
                return "Operation [fisrtOperand=" + fisrtOperand + ", secondOperand=" + secondOperand + ", operation="
                                + operation + ", result=" + result + ", status=" + status + ", ErrorCode=" + ErrorCode + "]";
        }

}
