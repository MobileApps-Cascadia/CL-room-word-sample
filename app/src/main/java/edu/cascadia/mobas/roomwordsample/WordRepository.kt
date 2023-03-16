package edu.cascadia.mobas.roomwordsample

import androidx.annotation.WorkerThread
import edu.cascadia.mobas.roomwordsample.data.Word
import edu.cascadia.mobas.roomwordsample.data.WordDao
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}