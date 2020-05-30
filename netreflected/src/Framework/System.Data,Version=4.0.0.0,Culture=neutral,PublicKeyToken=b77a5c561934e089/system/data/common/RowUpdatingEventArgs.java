/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.data.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DataRow;
import system.data.StatementType;
import system.data.UpdateStatus;
import system.data.common.DataTableMapping;


/**
 * The base .NET class managing System.Data.Common.RowUpdatingEventArgs, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RowUpdatingEventArgs extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.Common.RowUpdatingEventArgs";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RowUpdatingEventArgs(Object instance) throws Throwable {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    public static RowUpdatingEventArgs castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RowUpdatingEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    

    
    // Properties section
    
    
    public NetException getErrors() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Errors");
            return new NetException(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrors(NetException Errors) throws Throwable {
        try {
            classInstance.Set("Errors", (Object)Errors.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRow getRow() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Row");
            return new DataRow(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StatementType getStatementType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StatementType");
            return new StatementType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UpdateStatus getStatus() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Status");
            return new UpdateStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStatus(UpdateStatus Status) throws Throwable {
        try {
            classInstance.Set("Status", (Object)Status.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTableMapping getTableMapping() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TableMapping");
            return new DataTableMapping(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}