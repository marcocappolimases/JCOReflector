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

package system.transactions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TimeSpan;
import system.transactions.TransactionOptions;
import system.transactions.Enlistment;
import system.Guid;
import system.transactions.Transaction;
import system.transactions.DependentTransaction;
import system.transactions.DependentCloneOption;
import system.transactions.TransactionInformation;
import system.transactions.IsolationLevel;
import system.transactions.TransactionCompletedEventHandler;


/**
 * The base .NET class managing System.Transactions.CommittableTransaction, System.Transactions.Local, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class CommittableTransaction extends NetObject  {
    public static final String assemblyFullName = "System.Transactions.Local, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Transactions.Local";
    public static final String className = "System.Transactions.CommittableTransaction";
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

    public CommittableTransaction(Object instance) throws Throwable {
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

    public static CommittableTransaction castFrom(IJCOBridgeReflected from) throws Throwable {
        return new CommittableTransaction(from.getJCOInstance());
    }

    // Constructors section
    
    
    public CommittableTransaction() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.InvalidOperationException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommittableTransaction(TimeSpan timeout) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OverflowException, system.FormatException, system.InvalidOperationException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommittableTransaction(TransactionOptions options) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.InvalidOperationException, system.threading.AbandonedMutexException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] GetPromotedToken() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OverflowException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.transactions.TransactionException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPromotedToken");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetPromotedToken = 0; indexGetPromotedToken < resultingArrayList.size(); indexGetPromotedToken++ ) {
				resultingArray[indexGetPromotedToken] = (byte)resultingArrayList.get(indexGetPromotedToken);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rollback(NetException e) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OverflowException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.transactions.TransactionException {
        try {
            classInstance.Invoke("Rollback", (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transaction Clone() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OverflowException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new Transaction(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependentTransaction DependentClone(DependentCloneOption cloneOption) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OverflowException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.transactions.TransactionException {
        try {
            JCObject objDependentClone = (JCObject)classInstance.Invoke("DependentClone", (Object)cloneOption.getJCOInstance());
            return new DependentTransaction(objDependentClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.NotSupportedException, system.OverflowException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public TransactionInformation getTransactionInformation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TransactionInformation");
            return new TransactionInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolationLevel getIsolationLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IsolationLevel");
            return new IsolationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getPromoterType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PromoterType");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addTransactionCompleted(TransactionCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("TransactionCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTransactionCompleted(TransactionCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("TransactionCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}