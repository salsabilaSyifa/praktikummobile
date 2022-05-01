package com.example.modul4.data

import android.content.Context
import com.example.modul4.R


class Data(private val context: Context) {
    fun loadOddSemester(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.programing_concept),
                "Ir. Muhammad Alkaff S.Kom., M.Kom.",
                3,
                context.getString(R.string.schedule_programing_concept)
                ),
            Subject(context.getString(R.string.web_programing_concept),
                "Eka Setya Wijaya, S.T., M.Kom",
                3,
                context.getString(R.string.schedule_web_programing_concept)
                ),
            Subject(context.getString(R.string.algebra),
                "Juhriyansyah Dalle, Ph.D",
                2,
                context.getString(R.string.schedule_algebra)
                ),
            Subject(context.getString(R.string.calculus),
                "Juhriyansyah Dalle, Ph.D",
                2,
                context.getString(R.string.schedule_calculus)
            ),
            Subject(context.getString(R.string.pancasila),
                "Sri Ratnawati S.Pd., M.Pd.",
                2,
                context.getString(R.string.schedule_pancasila)
            )
        )
    }

    fun loadEvenSemester(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.object_oriented_programing),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                context.getString(R.string.schedule_object_oriented_programing)
            ),
            Subject(context.getString(R.string.web_design),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                "Tueday, 01.30 PM"
            ),
            Subject(context.getString(R.string.human_computer_interaction),
                "Juhriyansyah Dalle, Ph.D",
                2,
                context.getString(R.string.schedule_human_computer_interaction)
            ),
            Subject(context.getString(R.string.query_data_structured),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                context.getString(R.string.schedule_query_data_structured)
            ),
            Subject(context.getString(R.string.artificial_intelligent),
                "Yuslena Sari, S.Kom., M.Kom.",
                2,
                context.getString(R.string.schedule_artificial_intelligent)
            )
        )
    }

    fun loadOptionalSubject(): List<Subject> {
        return listOf(
            Subject(context.getString(R.string.data_warehouse_data_mining),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                context.getString(R.string.scedule_data_warehouse_and_data_mining)
            ),
            Subject(context.getString(R.string.mobile_programing),
                "Andreyan Rizky Baskara, S.Kom., M.Kom",
                3,
                context.getString(R.string.schedule_mobile_programing)
            ),
            Subject(context.getString(R.string.web_application_security),
                "Eka Setya Wijaya, S.T., M.Kom",
                2,
                context.getString(R.string.schedule_web_application_security)
            ),
            Subject(context.getString(R.string.web_framework),
                "Ir. Muhammad Alkaff S.Kom., M.Kom.",
                3,
                context.getString(R.string.schedule_web_framework)
            ),
            Subject(context.getString(R.string.audit_it),
                "Nurul Fathanah Mustamin, S.Pd., M.T.",
                2,
                context.getString(R.string.schedule_audit_it)
            )
        )
    }

}