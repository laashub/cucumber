import TestCase from './TestCase'
import { MessageNotifier } from './types'
import ExpressionStepDefinition from './ExpressionStepDefinition'
import { messages } from 'cucumber-messages'
import makeTestCase from './makeTestCase'
import IStepDefinition from './IStepDefinition'

export default class TestPlan {
  private readonly testCases: TestCase[]

  constructor(pickles: messages.IPickle[], stepDefinitions: IStepDefinition[]) {
    this.testCases = pickles.map(pickle =>
      makeTestCase(pickle, stepDefinitions)
    )
  }

  public execute(notifier: MessageNotifier) {
    for (const testCase of this.testCases) {
      notifier(testCase.toMessage())
    }
    for (const testCase of this.testCases) {
      testCase.execute(notifier, 0)
    }
  }
}