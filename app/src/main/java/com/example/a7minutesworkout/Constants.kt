package com.example.a7minutesworkout

object Constants {

    fun defaultExerciselist(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val Lunges = ExerciseModel(
            1,"Lunges",R.drawable.ic_lunge,false,false
        )
        exerciseList.add(Lunges)

        val Planks = ExerciseModel(
            2,"Planks",R.drawable.ic_plank,false,false
        )
        exerciseList.add(Planks)

        val SidePlanks = ExerciseModel(
            3,"Side Plank",R.drawable.ic_side_plank,false,false
        )
        exerciseList.add(SidePlanks)

        val Squats = ExerciseModel(
            4,"Squats",R.drawable.ic_squat,false,false
        )
        exerciseList.add(Squats)

        val SetUpOntoChair = ExerciseModel(
            5,"Set Up Onto Chair",R.drawable.ic_step_up_onto_chair,false,false
        )
        exerciseList.add(SetUpOntoChair)

        val TricepsDipsOnChair = ExerciseModel(
            6,"Triceps Dips On Chair",R.drawable.ic_triceps_dip_on_chair,false,false
        )
        exerciseList.add(TricepsDipsOnChair)

        val WallSit = ExerciseModel(
            7,"Wall Sit",R.drawable.ic_wall_sit,false,false
        )
        exerciseList.add(WallSit)


        return exerciseList
    }
}