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

package system.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.transactions.Transaction;
import system.activities.NativeActivityContext;
import system.activities.CodeActivityContext;
import system.activities.AsyncCodeActivityContext;
import system.activities.BookmarkCallback;
import system.activities.ActivityInstance;


/**
 * The base .NET class managing System.Activities.RuntimeTransactionHandle, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class RuntimeTransactionHandle extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.RuntimeTransactionHandle";
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

    public RuntimeTransactionHandle(Object instance) throws Throwable {
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

    public static RuntimeTransactionHandle castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RuntimeTransactionHandle(from.getJCOInstance());
    }

    // Constructors section
    
    
    public RuntimeTransactionHandle() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RuntimeTransactionHandle(Transaction rootTransaction) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)rootTransaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public Transaction GetCurrentTransaction(NativeActivityContext context) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetCurrentTransaction = (JCObject)classInstance.Invoke("GetCurrentTransaction", (Object)context.getJCOInstance());
            return new Transaction(objGetCurrentTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transaction GetCurrentTransaction(CodeActivityContext context) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetCurrentTransaction = (JCObject)classInstance.Invoke("GetCurrentTransaction", (Object)context.getJCOInstance());
            return new Transaction(objGetCurrentTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transaction GetCurrentTransaction(AsyncCodeActivityContext context) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetCurrentTransaction = (JCObject)classInstance.Invoke("GetCurrentTransaction", (Object)context.getJCOInstance());
            return new Transaction(objGetCurrentTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompleteTransaction(NativeActivityContext context) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("CompleteTransaction", (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CompleteTransaction(NativeActivityContext context, BookmarkCallback callback) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("CompleteTransaction", (Object)context.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAbortInstanceOnTransactionFailure() throws Throwable {
        try {
            return (boolean)classInstance.Get("AbortInstanceOnTransactionFailure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAbortInstanceOnTransactionFailure(boolean AbortInstanceOnTransactionFailure) throws Throwable {
        try {
            classInstance.Set("AbortInstanceOnTransactionFailure", AbortInstanceOnTransactionFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSuppressTransaction() throws Throwable {
        try {
            return (boolean)classInstance.Get("SuppressTransaction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuppressTransaction(boolean SuppressTransaction) throws Throwable {
        try {
            classInstance.Set("SuppressTransaction", SuppressTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance getOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Owner");
            return new ActivityInstance(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getExecutionPropertyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ExecutionPropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}