#### 軟體框架設計的作業
#### 題目
請參考 DIP 原則（Dependency Inversion Principle）設計一個通用型的遙控器 RemoteController, 可以對電視 (TV) 或冷氣 (AirConditioner) 做開、關、上、下（on, off, up, down）等動作。TV 預設的頻道是第七台，上下會在 1-15 間變化。冷氣預設 25 度，會在 20-30 度間變化。使用 Swing 來呈現此遙控器面板。(Hint: IRemoteControllable, 參考 Swing 範例。
#### 設計方法
在此程式中，設計一個介面Device，並在裡面設計開、關、上、下四個抽象method。還有一個類別RemoteController相依於介面Device。在TV跟AirCondition兩個類別中實踐Device的method。最後在Main類別中用Swing呈現遙控器面板。
