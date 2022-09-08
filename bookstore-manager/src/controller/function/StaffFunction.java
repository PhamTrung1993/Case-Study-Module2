package controller.function;

import controller.display.DisplayBook;
import controller.display.DisplayStaff;
import controller.manager.BookManager;
import controller.manager.StaffManager;
import controller.menu.BookMenu;
import controller.menu.StaffMenu;
import model.Staff;

import java.awt.print.Book;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class StaffFunction {
    public void searchStaffbyName(List<Staff> staffList){
        Iterator<Staff> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = staffList.iterator();
        while(iterator.hasNext()){
            Staff holder = iterator.next();
            if (holder.getStaffName() == nameValue) {
                DisplayStaff displayStaff = new DisplayStaff();
                StaffManager staffManager = new StaffManager(holder, displayStaff);
                staffManager.updateDisplayStaff();
            }
        }
    }
    public void searchStaffbyID(List<Staff> staffList) {
        Iterator<Staff> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = staffList.iterator();
        while(iterator.hasNext()){
            Staff holder = iterator.next();
            if (holder.getID() == idValue) {
                DisplayStaff displayStaff = new DisplayStaff();
                StaffManager staffManager = new StaffManager(holder, displayStaff);
                staffManager.updateDisplayStaff();
            }
        }
    }
    public void deleteStaffByName(List<Staff> staffList) {
        Iterator<Staff> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = staffList.iterator();
        while (iterator.hasNext()) {
            Staff holder = iterator.next();
            if (holder.getStaffName() == nameValue) {
                staffList.remove(holder);
                break;
            }
        }
    }
    public void editStaffByName(List<Staff> staffList) throws IOException {
        Iterator<Staff> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = staffList.iterator();
        while (iterator.hasNext()) {
            Staff holder = iterator.next();
            if (holder.getStaffName() == nameValue) {
                StaffMenu staffMenu = new StaffMenu();
                staffList.set(staffList.indexOf(holder), staffMenu.createStaffForm());
                break;
            }
        }
    }
}
