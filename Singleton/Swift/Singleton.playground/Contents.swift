import UIKit


var instance = SingletonClassExample.shared
var instance1 = SingletonClassExample.shared
var instance2 = SingletonClassExample.shared

instance1.name = "hello"
instance.name = "Mohamed"
instance2.name = "Kamel"

var structInstance = SingletonStructExample.shared
var structInstance1 = SingletonStructExample.shared

structInstance1.name = "Ismail"
structInstance = structInstance1
structInstance.name = "Kamel"


print("\(String(describing: instance.name))")
print("\(String(describing: instance1.name))")
print("\(String(describing: instance2.name))")

