#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |

#  Feature: Entrance Exam multiple values functionality
#
#    Background:
#
#      Given Navigate to Campus
#      When Enter username and password and click login button
#      Then User should login succesfully
#
#      Scenario Outline: Entrance Exam
#        And Click on the element in LeftNav
#          | entranceExams |
#          | entranceSetup |
#          | entranceExams2 |
#
#        And Click on the element in Dialog
#          | addButton |
#
#        And User sending the keys in Dialog Content
#          | nameInput | <Examname> |
#
#        And User sending the keys in Dialog Content
#          | period |  | <AcademicPeriodOption> |
#        And Click on the element in Dialog
#          | period2 |
#        And User sending the keys in Dialog Content
#          | grade |  | <GradeLevelOption> |
#        And Click on the element in Dialog
#          | grade2 |
#
#        And Click on the element in Dialog
#          | saveInput |
#
#        Then Succes message should be displayed
#
#        And Click on the element in Dialog
#          | back |
#
#        And User delete item from Dialog Content
#          | <Examname>  |
#
#        Then Succes message should be displayed
#        Examples:
#          | Examname        | AcademicPeriodOption | GradeLevelOption
#          | Math exam ber1  | academicPeriod1      | gradeLevel2 |
#          | IT exam ber1    | academicPeriod1      | gradeLevel3 |
#          | Oracle exam ber2| academicPeriod1      | gradeLevel4 |
#          | Math exam ber2  | academicPeriod1      | gradeLevel5 |
