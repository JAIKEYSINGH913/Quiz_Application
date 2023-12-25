package singh.jaikey.quiz

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWER:String="correct_answer"



    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"what country does this wflag belong to?",
            R.drawable.ic_flag_of_argentina,"Argentina","Austrialia","Armenia","Austria",
            1)
        questionsList.add(que1)

        val que2 = Question(
            2,"what country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"denmark","Austrialia","Armenia","Austria",
            1)
        questionsList.add(que2)
        val que3 = Question(
            3,"what country does this flag belong to?",
            R.drawable.ic_flag_of_india,"Argentina","india","Armenia","Austria",
            2)
        questionsList.add(que3)

        val que4 = Question(
            4,"what country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"Argentina","Austrialia","Armenia","Austria",
            2)
        questionsList.add(que4)

        val que5 = Question(
            5,"what country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"Argentina","Austrialia","New zealand","Austria",
            3)
        questionsList.add(que5)

        return questionsList
    }
}