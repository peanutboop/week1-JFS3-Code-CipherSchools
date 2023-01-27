
    interface olaCustomer{
        void bookCab();
        void findRide();
        void rentCab();
        void rateDriver();
        void scheduleCad();
        void cancelCab();
        void addMoneyToWallet();
        void raiseTicket();
        void signup();
        void signIn();



    }
    interface olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void setAvailableStatus();
        void getMyCommission();
        void raiseMoneyTransferRequests();
        void callCustomer();
        void setUpYourVehicle();
        void customerFeedback();


    }
    interface olaOwner{

        void getDriverRecords();
        void getReportByDriverID();
        void getReportByRegion();
        void getTotalRevenue();
        void getCustomerFeedback();
        void addDriver();
        void removeDriver();
        void changeDriverStatus();


    }
    public class Test10 implements olaCustomer,olaDriver,olaOwner {

        public static void main(String[] args) {
            olaCustomer customer1 = new Test10();

            olaDriver manoj = new Test10();

            manoj.acceptBooking();


        }

            @Override
            public void bookCab () {

            }

            @Override
            public void findRide () {

            }

            @Override
            public void rentCab () {

            }

            @Override
            public void rateDriver () {

            }

            @Override
            public void scheduleCad () {

            }

            @Override
            public void cancelCab () {

            }

            @Override
            public void addMoneyToWallet () {

            }

            @Override
            public void raiseTicket () {

            }

            @Override
            public void signup () {

            }

            @Override
            public void signIn () {

            }

            @Override
            public void acceptBooking () {

            }

            @Override
            public void getCustomerLocation () {

            }

            @Override
            public void setAvailableStatus () {

            }

            @Override
            public void getMyCommission () {

            }

            @Override
            public void raiseMoneyTransferRequests () {

            }

            @Override
            public void callCustomer () {

            }

            @Override
            public void setUpYourVehicle () {

            }

            @Override
            public void customerFeedback () {

            }

            @Override
            public void getDriverRecords () {

            }

            @Override
            public void getReportByDriverID () {

            }

            @Override
            public void getReportByRegion () {

            }

            @Override
            public void getTotalRevenue () {

            }

            @Override
            public void getCustomerFeedback () {

            }

            @Override
            public void addDriver () {

            }

            @Override
            public void removeDriver () {

            }

            @Override
            public void changeDriverStatus () {

            }
        }









