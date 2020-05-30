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
import system.activities.ActivityInstance;
import system.activities.Bookmark;
import system.activities.BookmarkCallback;
import system.activities.BookmarkScope;
import system.activities.Activity;
import system.activities.CompletionCallback;
import system.activities.FaultCallback;
import system.activities.Variable;
import system.activities.BookmarkOptions;
import system.activities.BookmarkResumptionResult;
import system.activities.ActivityAction;
import system.activities.ActivityDelegate;
import system.activities.tracking.CustomTrackingRecord;
import system.activities.Argument;
import system.activities.RuntimeArgument;
import system.activities.ExecutionProperties;
import system.Guid;
import system.activities.WorkflowDataContext;


/**
 * The base .NET class managing System.Activities.NativeActivityTransactionContext, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class NativeActivityTransactionContext extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.NativeActivityTransactionContext";
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

    public NativeActivityTransactionContext(Object instance) throws Throwable {
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

    public static NativeActivityTransactionContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new NativeActivityTransactionContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void SetRuntimeTransaction(Transaction transaction) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.FormatException, system.xml.XmlException, system.transactions.TransactionException {
        try {
            classInstance.Invoke("SetRuntimeTransaction", (Object)transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelChildren() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("CancelChildren");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbortChildInstance(ActivityInstance activity) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.transactions.TransactionException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("AbortChildInstance", (Object)activity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abort(NetException reason) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException {
        try {
            classInstance.Invoke("Abort", (Object)reason.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(java.lang.String name, BookmarkCallback callback) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", (Object)name, callback);
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(java.lang.String name, BookmarkCallback callback, BookmarkScope scope) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", (Object)name, callback, (Object)scope.getJCOInstance());
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark");
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(BookmarkCallback callback) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", callback);
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAllBookmarks() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("RemoveAllBookmarks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance ScheduleActivity(Activity activity) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objScheduleActivity = (JCObject)classInstance.Invoke("ScheduleActivity", (Object)activity.getJCOInstance());
            return new ActivityInstance(objScheduleActivity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance ScheduleActivity(Activity activity, CompletionCallback onCompleted) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objScheduleActivity = (JCObject)classInstance.Invoke("ScheduleActivity", (Object)activity.getJCOInstance(), onCompleted);
            return new ActivityInstance(objScheduleActivity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance ScheduleActivity(Activity activity, FaultCallback onFaulted) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.FormatException {
        try {
            JCObject objScheduleActivity = (JCObject)classInstance.Invoke("ScheduleActivity", (Object)activity.getJCOInstance(), onFaulted);
            return new ActivityInstance(objScheduleActivity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(Variable variable) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)variable.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(Variable variable, NetObject value) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("SetValue", (Object)variable.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbortChildInstance(ActivityInstance activity, NetException reason) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.ObjectDisposedException, system.transactions.TransactionException {
        try {
            classInstance.Invoke("AbortChildInstance", (Object)activity.getJCOInstance(), (Object)reason.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(java.lang.String name, BookmarkCallback callback, BookmarkOptions options) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.xml.XmlException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", (Object)name, callback, (Object)options.getJCOInstance());
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(java.lang.String name, BookmarkCallback callback, BookmarkScope scope, BookmarkOptions options) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", (Object)name, callback, (Object)scope.getJCOInstance(), (Object)options.getJCOInstance());
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MarkCanceled() throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("MarkCanceled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveBookmark(java.lang.String name) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classInstance.Invoke("RemoveBookmark", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveBookmark(Bookmark bookmark) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classInstance.Invoke("RemoveBookmark", (Object)bookmark.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveBookmark(java.lang.String name, BookmarkScope scope) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classInstance.Invoke("RemoveBookmark", (Object)name, (Object)scope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BookmarkResumptionResult ResumeBookmark(Bookmark bookmark, NetObject value) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        try {
            JCObject objResumeBookmark = (JCObject)classInstance.Invoke("ResumeBookmark", (Object)bookmark.getJCOInstance(), (Object)value.getJCOInstance());
            return new BookmarkResumptionResult(objResumeBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance ScheduleAction(ActivityAction activityAction, CompletionCallback onCompleted, FaultCallback onFaulted) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.NullReferenceException {
        try {
            JCObject objScheduleAction = (JCObject)classInstance.Invoke("ScheduleAction", (Object)activityAction.getJCOInstance(), onCompleted, onFaulted);
            return new ActivityInstance(objScheduleAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Track(CustomTrackingRecord record) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("Track", (Object)record.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelChild(ActivityInstance activityInstance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("CancelChild", (Object)activityInstance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(java.lang.String name) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.xml.XmlException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", (Object)name);
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bookmark CreateBookmark(BookmarkCallback callback, BookmarkOptions options) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.xml.XmlException {
        try {
            JCObject objCreateBookmark = (JCObject)classInstance.Invoke("CreateBookmark", callback, (Object)options.getJCOInstance());
            return new Bookmark(objCreateBookmark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInstance ScheduleActivity(Activity activity, CompletionCallback onCompleted, FaultCallback onFaulted) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException {
        try {
            JCObject objScheduleActivity = (JCObject)classInstance.Invoke("ScheduleActivity", (Object)activity.getJCOInstance(), onCompleted, onFaulted);
            return new ActivityInstance(objScheduleActivity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(Argument argument) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)argument.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(RuntimeArgument runtimeArgument) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)runtimeArgument.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(Argument argument, NetObject value) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("SetValue", (Object)argument.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public BookmarkScope getDefaultBookmarkScope() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultBookmarkScope");
            return new BookmarkScope(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCancellationRequested() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCancellationRequested");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExecutionProperties getProperties() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new ExecutionProperties(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getActivityInstanceId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ActivityInstanceId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getWorkflowInstanceId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WorkflowInstanceId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowDataContext getDataContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataContext");
            return new WorkflowDataContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}