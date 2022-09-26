class Shop {
    public void displayInfo() {
      System.out.println("Display the name of Shop");
    }
  }
  
  class Java extends Shop {
    @Override
    public void displayInfo() {
      System.out.println(" Shop name is : Java");
    }
  }
  
  