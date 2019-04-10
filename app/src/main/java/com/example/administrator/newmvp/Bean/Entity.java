package com.example.administrator.newmvp.Bean;

import java.util.List;

public class Entity {

        /**
         * code : 200
         * msg : 成功
         * data : {"bulletList":["打卡0062：领取了35.87元现金","打卡0062：领取了16.82元现金","打卡0062：领取了29.88元现金","打卡0062：领取了28.63元现金","打卡0062：领取了99.27元现金","打卡0062：领取了46.65元现金","打卡0062：领取了23.61元现金","打卡0062：领取了25.16元现金","打卡0062：领取了71.53元现金","打卡0062：领取了18.79元现金","打卡0062：领取了52.51元现金"]}
         */

        private int code;
        private String msg;
        private DataBean data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public class DataBean {
            private List<String> bulletList;

            public List<String> getBulletList() {
                return bulletList;
            }

            public void setBulletList(List<String> bulletList) {
                this.bulletList = bulletList;
            }
        }


}
