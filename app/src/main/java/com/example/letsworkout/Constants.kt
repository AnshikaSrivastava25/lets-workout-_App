package com.example.letsworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val  jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(2,"Wall Sit", R.drawable.ic_wall_sit,false,false)
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(3, "Push Up", R.drawable.ic_push_up,false,false)
        exerciseList.add(pushUp)

        val lunge = ExerciseModel(4, "Lunge", R.drawable.ic_lunge,false,false)
        exerciseList.add(lunge)

        val abdominalCrunch = ExerciseModel(5,"Abdominal Crunch",R.drawable.ic_abdominal_crunch,false,false)
        exerciseList.add(abdominalCrunch)

        val highKneesRunningInPlace = ExerciseModel(6,"High Knees Running In Place",R.drawable.ic_high_knees_running_in_place,false,false)
        exerciseList.add(highKneesRunningInPlace)

        val plank = ExerciseModel(7,"Plank",R.drawable.ic_plank,false,false)
        exerciseList.add(plank)

        val pushUpAndRotation = ExerciseModel(8,"Push Up And Rotation",R.drawable.ic_push_up_and_rotation,false,false)
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(9,"Side Plank",R.drawable.ic_side_plank,false,false)
        exerciseList.add(sidePlank)

        val squat = ExerciseModel(10,"Squat",R.drawable.ic_squat,false,false)
        exerciseList.add(squat)

        val stepUpOntoChair = ExerciseModel(11,"Step Up Onto Chair",R.drawable.ic_step_up_onto_chair,false,false)
        exerciseList.add(stepUpOntoChair)

        val triceps = ExerciseModel(12,"Triceps Dip On Chair",R.drawable.ic_triceps_dip_on_chair,false,false)
        exerciseList.add(triceps)


        return exerciseList


    }
}