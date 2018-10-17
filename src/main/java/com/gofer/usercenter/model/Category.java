package com.gofer.usercenter.model;

import java.util.List;

public class Category {


    /**
     * ret : true
     * status : 0
     * data : {"suggestionId":55,"place":2,"code":99901055,"channelId":15,"name":"e14ce111-a426-4f89-aba5-390232a7ed93","displayTimes":[{"beginDate":"2018-09-14","endDate":"2019-10-31","weekdays":[1,2,3,4,5,6,7],"timeRanges":[{"beginTime":"00:34:03","endTime":"23:34:04"}]}],"productInfos":[{"code":99001055,"name":"","displayTimes":[],"productIds":"","imgUrl":[""],"categoryCode":"","sort":0}],"state":1,"comment":"","shopCodes":"","isSpecial":false,"cityCodes":null,"hasCityScope":false,"categoryList":[{"id":0,"code":99900055,"name":"爆款网红","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/13/9e87821ec1973b0066ee582f.png","sort":0,"productInfos":[{"code":990000055,"name":"饭团","productIds":"12010053,08010034,04020006,06010208,06010207,12010026,11010014,06010016,12030070,06010202,06010201,06010101,04010002,01010101,05010005,05010013,05010015,05010011,05010010,12010004,12030011,12020011,21010101,11010001","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"12010053"},{"skuCode":"08010034"},{"skuCode":"04020006"},{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"12010026"},{"skuCode":"11010014"},{"skuCode":"06010016"},{"skuCode":"12030070"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"04010002"},{"skuCode":"01010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"},{"skuCode":"12010004"},{"skuCode":"12030011"},{"skuCode":"12020011"},{"skuCode":"21010101"},{"skuCode":"11010001"}]}]},{"id":0,"code":99901055,"name":"休闲食品","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/fc7668b915d0919e66ee582f.png","sort":1,"productInfos":[{"code":990010055,"name":"油量","productIds":"03011612,03011627,03011626,03011625,03011624","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"03011612"},{"skuCode":"03011627"},{"skuCode":"03011626"},{"skuCode":"03011625"},{"skuCode":"03011624"}]},{"code":990011055,"name":"qwer","productIds":"","imgUrl":[""],"sort":0,"skuInfos":[]},{"code":990012055,"name":"asdf","productIds":"","imgUrl":[""],"sort":0,"skuInfos":[]}]},{"id":0,"code":99902055,"name":"热食便当","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/5e338ddbb133e24066ee582f.png","sort":2,"productInfos":[{"code":990020055,"name":"小米饭","productIds":"33080003","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33080003"}]}]},{"id":0,"code":99903055,"name":"轻食沙拉","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":3,"productInfos":[{"code":990030055,"name":"小酸奶","productIds":"06010208,06010207,33060036,06010016,06010202,06010201,06010101,05010005,05010013,05010015,05010011,05010010","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"33060036"},{"skuCode":"06010016"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"}]}]},{"id":0,"code":99904055,"name":"方便速食","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/2fe422dbd32f673566ee582f.jpg","sort":4,"productInfos":[{"code":990040055,"name":"测试1","productIds":"34010026","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"34010026"}]}]},{"id":0,"code":99905055,"name":"个护配饰","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":5,"productInfos":[{"code":990050055,"name":"测试23","productIds":"33050036","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050036"}]}]},{"id":0,"code":99906055,"name":"粮油调味","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/00204ef389c2ab2c66ee582f.jpg","sort":6,"productInfos":[{"code":990060055,"name":"测试31","productIds":"33050019","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050019"}]}]},{"id":0,"code":99907055,"name":"中外名酒","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":7,"productInfos":[{"code":990070055,"name":"测试5","productIds":"33050016","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050016"}]}]},{"id":0,"code":99908055,"name":"去玩儿","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/e29bfbfc5c6caab966ee582f.png","sort":0,"productInfos":[]}],"totalProductQty":46}
     */

    private boolean ret;
    private int status;
    private DataBean data;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * suggestionId : 55
         * place : 2
         * code : 99901055
         * channelId : 15
         * name : e14ce111-a426-4f89-aba5-390232a7ed93
         * displayTimes : [{"beginDate":"2018-09-14","endDate":"2019-10-31","weekdays":[1,2,3,4,5,6,7],"timeRanges":[{"beginTime":"00:34:03","endTime":"23:34:04"}]}]
         * productInfos : [{"code":99001055,"name":"","displayTimes":[],"productIds":"","imgUrl":[""],"categoryCode":"","sort":0}]
         * state : 1
         * comment :
         * shopCodes :
         * isSpecial : false
         * cityCodes : null
         * hasCityScope : false
         * categoryList : [{"id":0,"code":99900055,"name":"爆款网红","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/13/9e87821ec1973b0066ee582f.png","sort":0,"productInfos":[{"code":990000055,"name":"饭团","productIds":"12010053,08010034,04020006,06010208,06010207,12010026,11010014,06010016,12030070,06010202,06010201,06010101,04010002,01010101,05010005,05010013,05010015,05010011,05010010,12010004,12030011,12020011,21010101,11010001","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"12010053"},{"skuCode":"08010034"},{"skuCode":"04020006"},{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"12010026"},{"skuCode":"11010014"},{"skuCode":"06010016"},{"skuCode":"12030070"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"04010002"},{"skuCode":"01010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"},{"skuCode":"12010004"},{"skuCode":"12030011"},{"skuCode":"12020011"},{"skuCode":"21010101"},{"skuCode":"11010001"}]}]},{"id":0,"code":99901055,"name":"休闲食品","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/fc7668b915d0919e66ee582f.png","sort":1,"productInfos":[{"code":990010055,"name":"油量","productIds":"03011612,03011627,03011626,03011625,03011624","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"03011612"},{"skuCode":"03011627"},{"skuCode":"03011626"},{"skuCode":"03011625"},{"skuCode":"03011624"}]},{"code":990011055,"name":"qwer","productIds":"","imgUrl":[""],"sort":0,"skuInfos":[]},{"code":990012055,"name":"asdf","productIds":"","imgUrl":[""],"sort":0,"skuInfos":[]}]},{"id":0,"code":99902055,"name":"热食便当","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/5e338ddbb133e24066ee582f.png","sort":2,"productInfos":[{"code":990020055,"name":"小米饭","productIds":"33080003","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33080003"}]}]},{"id":0,"code":99903055,"name":"轻食沙拉","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":3,"productInfos":[{"code":990030055,"name":"小酸奶","productIds":"06010208,06010207,33060036,06010016,06010202,06010201,06010101,05010005,05010013,05010015,05010011,05010010","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"33060036"},{"skuCode":"06010016"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"}]}]},{"id":0,"code":99904055,"name":"方便速食","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/2fe422dbd32f673566ee582f.jpg","sort":4,"productInfos":[{"code":990040055,"name":"测试1","productIds":"34010026","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"34010026"}]}]},{"id":0,"code":99905055,"name":"个护配饰","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":5,"productInfos":[{"code":990050055,"name":"测试23","productIds":"33050036","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050036"}]}]},{"id":0,"code":99906055,"name":"粮油调味","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/00204ef389c2ab2c66ee582f.jpg","sort":6,"productInfos":[{"code":990060055,"name":"测试31","productIds":"33050019","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050019"}]}]},{"id":0,"code":99907055,"name":"中外名酒","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/9e5350343cf12d7e66ee582f.jpg","sort":7,"productInfos":[{"code":990070055,"name":"测试5","productIds":"33050016","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"33050016"}]}]},{"id":0,"code":99908055,"name":"去玩儿","productSuggestionId":55,"imgUrl":"http://zz.wormpex.com/productSubject/201809/14/e29bfbfc5c6caab966ee582f.png","sort":0,"productInfos":[]}]
         * totalProductQty : 46
         */

        private int suggestionId;
        private int place;
        private int code;
        private int channelId;
        private String name;
        private int state;
        private String comment;
        private String shopCodes;
        private boolean isSpecial;
        private Object cityCodes;
        private boolean hasCityScope;
        private int totalProductQty;
        private List<DisplayTimesBean> displayTimes;
        private List<ProductInfosBean> productInfos;
        private List<CategoryListBean> categoryList;

        public int getSuggestionId() {
            return suggestionId;
        }

        public void setSuggestionId(int suggestionId) {
            this.suggestionId = suggestionId;
        }

        public int getPlace() {
            return place;
        }

        public void setPlace(int place) {
            this.place = place;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getChannelId() {
            return channelId;
        }

        public void setChannelId(int channelId) {
            this.channelId = channelId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getShopCodes() {
            return shopCodes;
        }

        public void setShopCodes(String shopCodes) {
            this.shopCodes = shopCodes;
        }

        public boolean isIsSpecial() {
            return isSpecial;
        }

        public void setIsSpecial(boolean isSpecial) {
            this.isSpecial = isSpecial;
        }

        public Object getCityCodes() {
            return cityCodes;
        }

        public void setCityCodes(Object cityCodes) {
            this.cityCodes = cityCodes;
        }

        public boolean isHasCityScope() {
            return hasCityScope;
        }

        public void setHasCityScope(boolean hasCityScope) {
            this.hasCityScope = hasCityScope;
        }

        public int getTotalProductQty() {
            return totalProductQty;
        }

        public void setTotalProductQty(int totalProductQty) {
            this.totalProductQty = totalProductQty;
        }

        public List<DisplayTimesBean> getDisplayTimes() {
            return displayTimes;
        }

        public void setDisplayTimes(List<DisplayTimesBean> displayTimes) {
            this.displayTimes = displayTimes;
        }

        public List<ProductInfosBean> getProductInfos() {
            return productInfos;
        }

        public void setProductInfos(List<ProductInfosBean> productInfos) {
            this.productInfos = productInfos;
        }

        public List<CategoryListBean> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryListBean> categoryList) {
            this.categoryList = categoryList;
        }

        public static class DisplayTimesBean {
            /**
             * beginDate : 2018-09-14
             * endDate : 2019-10-31
             * weekdays : [1,2,3,4,5,6,7]
             * timeRanges : [{"beginTime":"00:34:03","endTime":"23:34:04"}]
             */

            private String beginDate;
            private String endDate;
            private List<Integer> weekdays;
            private List<TimeRangesBean> timeRanges;

            public String getBeginDate() {
                return beginDate;
            }

            public void setBeginDate(String beginDate) {
                this.beginDate = beginDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public List<Integer> getWeekdays() {
                return weekdays;
            }

            public void setWeekdays(List<Integer> weekdays) {
                this.weekdays = weekdays;
            }

            public List<TimeRangesBean> getTimeRanges() {
                return timeRanges;
            }

            public void setTimeRanges(List<TimeRangesBean> timeRanges) {
                this.timeRanges = timeRanges;
            }

            public static class TimeRangesBean {
                /**
                 * beginTime : 00:34:03
                 * endTime : 23:34:04
                 */

                private String beginTime;
                private String endTime;

                public String getBeginTime() {
                    return beginTime;
                }

                public void setBeginTime(String beginTime) {
                    this.beginTime = beginTime;
                }

                public String getEndTime() {
                    return endTime;
                }

                public void setEndTime(String endTime) {
                    this.endTime = endTime;
                }
            }
        }

        public static class ProductInfosBean {
            /**
             * code : 99001055
             * name :
             * displayTimes : []
             * productIds :
             * imgUrl : [""]
             * categoryCode :
             * sort : 0
             */

            private int code;
            private String name;
            private String productIds;
            private String categoryCode;
            private int sort;
            private List<?> displayTimes;
            private List<String> imgUrl;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProductIds() {
                return productIds;
            }

            public void setProductIds(String productIds) {
                this.productIds = productIds;
            }

            public String getCategoryCode() {
                return categoryCode;
            }

            public void setCategoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public List<?> getDisplayTimes() {
                return displayTimes;
            }

            public void setDisplayTimes(List<?> displayTimes) {
                this.displayTimes = displayTimes;
            }

            public List<String> getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(List<String> imgUrl) {
                this.imgUrl = imgUrl;
            }
        }

        public static class CategoryListBean {
            /**
             * id : 0
             * code : 99900055
             * name : 爆款网红
             * productSuggestionId : 55
             * imgUrl : http://zz.wormpex.com/productSubject/201809/13/9e87821ec1973b0066ee582f.png
             * sort : 0
             * productInfos : [{"code":990000055,"name":"饭团","productIds":"12010053,08010034,04020006,06010208,06010207,12010026,11010014,06010016,12030070,06010202,06010201,06010101,04010002,01010101,05010005,05010013,05010015,05010011,05010010,12010004,12030011,12020011,21010101,11010001","imgUrl":[""],"sort":0,"skuInfos":[{"skuCode":"12010053"},{"skuCode":"08010034"},{"skuCode":"04020006"},{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"12010026"},{"skuCode":"11010014"},{"skuCode":"06010016"},{"skuCode":"12030070"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"04010002"},{"skuCode":"01010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"},{"skuCode":"12010004"},{"skuCode":"12030011"},{"skuCode":"12020011"},{"skuCode":"21010101"},{"skuCode":"11010001"}]}]
             */

            private int id;
            private int code;
            private String name;
            private int productSuggestionId;
            private String imgUrl;
            private int sort;
            private List<ProductInfosBeanX> productInfos;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getProductSuggestionId() {
                return productSuggestionId;
            }

            public void setProductSuggestionId(int productSuggestionId) {
                this.productSuggestionId = productSuggestionId;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public List<ProductInfosBeanX> getProductInfos() {
                return productInfos;
            }

            public void setProductInfos(List<ProductInfosBeanX> productInfos) {
                this.productInfos = productInfos;
            }

            public static class ProductInfosBeanX {
                /**
                 * code : 990000055
                 * name : 饭团
                 * productIds : 12010053,08010034,04020006,06010208,06010207,12010026,11010014,06010016,12030070,06010202,06010201,06010101,04010002,01010101,05010005,05010013,05010015,05010011,05010010,12010004,12030011,12020011,21010101,11010001
                 * imgUrl : [""]
                 * sort : 0
                 * skuInfos : [{"skuCode":"12010053"},{"skuCode":"08010034"},{"skuCode":"04020006"},{"skuCode":"06010208"},{"skuCode":"06010207"},{"skuCode":"12010026"},{"skuCode":"11010014"},{"skuCode":"06010016"},{"skuCode":"12030070"},{"skuCode":"06010202"},{"skuCode":"06010201"},{"skuCode":"06010101"},{"skuCode":"04010002"},{"skuCode":"01010101"},{"skuCode":"05010005"},{"skuCode":"05010013"},{"skuCode":"05010015"},{"skuCode":"05010011"},{"skuCode":"05010010"},{"skuCode":"12010004"},{"skuCode":"12030011"},{"skuCode":"12020011"},{"skuCode":"21010101"},{"skuCode":"11010001"}]
                 */

                private int code;
                private String name;
                private String productIds;
                private int sort;
                private List<String> imgUrl;
                private List<SkuInfosBean> skuInfos;

                public int getCode() {
                    return code;
                }

                public void setCode(int code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getProductIds() {
                    return productIds;
                }

                public void setProductIds(String productIds) {
                    this.productIds = productIds;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getImgUrl() {
                    return imgUrl;
                }

                public void setImgUrl(List<String> imgUrl) {
                    this.imgUrl = imgUrl;
                }

                public List<SkuInfosBean> getSkuInfos() {
                    return skuInfos;
                }

                public void setSkuInfos(List<SkuInfosBean> skuInfos) {
                    this.skuInfos = skuInfos;
                }

                public static class SkuInfosBean {
                    /**
                     * skuCode : 12010053
                     */

                    private String skuCode;

                    public String getSkuCode() {
                        return skuCode;
                    }

                    public void setSkuCode(String skuCode) {
                        this.skuCode = skuCode;
                    }
                }
            }
        }
    }
}
