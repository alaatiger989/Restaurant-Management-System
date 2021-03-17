/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Alaa_Sayed
 */
public class UserPrivilegesModel {
    
    public static boolean viewLectures;
    public static boolean addLecture;
    public static boolean updateLecture;
    public static boolean deleteLecture;
    public static boolean addAssignment;
    public static boolean updateAssignment;
    public static boolean deleteAssignment;
    public static boolean addExam;
    public static boolean updateExam;
    public static boolean deleteExam;
    public static boolean registerCourses;
    public static boolean assignStudentsToExam;
    public static boolean correctExams;
    public static boolean generateResults;
    public static boolean addCourse;
    public static boolean updateCourse;
    public static boolean deleteCourse;
    public static boolean viewAssignment;
    public static boolean viewExam;

    public static boolean isViewExam() {
        return viewExam;
    }

    public static void setViewExam(boolean viewExam) {
        UserPrivilegesModel.viewExam = viewExam;
    }
    
    public static boolean isViewAssignment() {
        return viewAssignment;
    }

    public static void setViewAssignment(boolean viewAssignment) {
        UserPrivilegesModel.viewAssignment = viewAssignment;
    }
    public static boolean isViewLectures() {
        return viewLectures;
    }

    public static void setViewLectures(boolean viewLectures) {
        UserPrivilegesModel.viewLectures = viewLectures;
    }

    public static boolean isAddLecture() {
        return addLecture;
    }

    public static void setAddLecture(boolean addLecture) {
        UserPrivilegesModel.addLecture = addLecture;
    }

    public static boolean isUpdateLecture() {
        return updateLecture;
    }

    public static void setUpdateLecture(boolean updateLecture) {
        UserPrivilegesModel.updateLecture = updateLecture;
    }

    public static boolean isDeleteLecture() {
        return deleteLecture;
    }

    public static void setDeleteLecture(boolean deleteLecture) {
        UserPrivilegesModel.deleteLecture = deleteLecture;
    }

    public static boolean isAddAssignment() {
        return addAssignment;
    }

    public static void setAddAssignment(boolean addAssignment) {
        UserPrivilegesModel.addAssignment = addAssignment;
    }

    public static boolean isUpdateAssignment() {
        return updateAssignment;
    }

    public static void setUpdateAssignment(boolean updateAssignment) {
        UserPrivilegesModel.updateAssignment = updateAssignment;
    }

    public static boolean isDeleteAssignment() {
        return deleteAssignment;
    }

    public static void setDeleteAssignment(boolean deleteAssignment) {
        UserPrivilegesModel.deleteAssignment = deleteAssignment;
    }

    public static boolean isAddExam() {
        return addExam;
    }

    public static void setAddExam(boolean addExam) {
        UserPrivilegesModel.addExam = addExam;
    }

    public static boolean isUpdateExam() {
        return updateExam;
    }

    public static void setUpdateExam(boolean updateExam) {
        UserPrivilegesModel.updateExam = updateExam;
    }

    public static boolean isDeleteExam() {
        return deleteExam;
    }

    public static void setDeleteExam(boolean deleteExam) {
        UserPrivilegesModel.deleteExam = deleteExam;
    }

    public static boolean isRegisterCourses() {
        return registerCourses;
    }

    public static void setRegisterCourses(boolean registerCourses) {
        UserPrivilegesModel.registerCourses = registerCourses;
    }

    public static boolean isAssignStudentsToExam() {
        return assignStudentsToExam;
    }

    public static void setAssignStudentsToExam(boolean assignStudentsToExam) {
        UserPrivilegesModel.assignStudentsToExam = assignStudentsToExam;
    }

    public static boolean isCorrectExams() {
        return correctExams;
    }

    public static void setCorrectExams(boolean correctExams) {
        UserPrivilegesModel.correctExams = correctExams;
    }

    public static boolean isGenerateResults() {
        return generateResults;
    }

    public static void setGenerateResults(boolean generateResults) {
        UserPrivilegesModel.generateResults = generateResults;
    }

    public static boolean isAddCourse() {
        return addCourse;
    }

    public static void setAddCourse(boolean addCourse) {
        UserPrivilegesModel.addCourse = addCourse;
    }

    public static boolean isUpdateCourse() {
        return updateCourse;
    }

    public static void setUpdateCourse(boolean updateCourse) {
        UserPrivilegesModel.updateCourse = updateCourse;
    }

    public static boolean isDeleteCourse() {
        return deleteCourse;
    }

    public static void setDeleteCourse(boolean deleteCourse) {
        UserPrivilegesModel.deleteCourse = deleteCourse;
    }

   
    
}
