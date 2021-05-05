//
//  SingletonClassExample.swift
//  
//
//  Created by Mohamed Ismail on 5/5/21.
//

import Foundation

public class SingletonClassExample{
    
     public static let shared:SingletonClassExample = SingletonClassExample()
    
     public var name:String?
    
    
    private init() {
        
    }
    

    
}
