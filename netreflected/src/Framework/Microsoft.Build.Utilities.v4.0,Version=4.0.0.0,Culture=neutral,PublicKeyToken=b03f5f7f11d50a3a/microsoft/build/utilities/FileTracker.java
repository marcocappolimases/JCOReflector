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

package microsoft.build.utilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.utilities.ExecutableType;
import system.diagnostics.Process;


/**
 * The base .NET class managing Microsoft.Build.Utilities.FileTracker, Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class FileTracker extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Utilities.v4.0";
    public static final String className = "Microsoft.Build.Utilities.FileTracker";
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

    public FileTracker(Object instance) throws Throwable {
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

    public static FileTracker castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FileTracker(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static void EndTrackingContext() throws Throwable {
        try {
            classType.Invoke("EndTrackingContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ResumeTracking() throws Throwable {
        try {
            classType.Invoke("ResumeTracking");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetThreadCount(int threadCount) throws Throwable {
        try {
            classType.Invoke("SetThreadCount", threadCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void StartTrackingContext(java.lang.String intermediateDirectory, java.lang.String taskName) throws Throwable {
        try {
            classType.Invoke("StartTrackingContext", (Object)intermediateDirectory, (Object)taskName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void StartTrackingContextWithRoot(java.lang.String intermediateDirectory, java.lang.String taskName, java.lang.String rootMarkerResponseFile) throws Throwable {
        try {
            classType.Invoke("StartTrackingContextWithRoot", (Object)intermediateDirectory, (Object)taskName, (Object)rootMarkerResponseFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void StopTrackingAndCleanup() throws Throwable {
        try {
            classType.Invoke("StopTrackingAndCleanup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SuspendTracking() throws Throwable {
        try {
            classType.Invoke("SuspendTracking");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteAllTLogs(java.lang.String intermediateDirectory, java.lang.String taskName) throws Throwable {
        try {
            classType.Invoke("WriteAllTLogs", (Object)intermediateDirectory, (Object)taskName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteContextTLogs(java.lang.String intermediateDirectory, java.lang.String taskName) throws Throwable {
        try {
            classType.Invoke("WriteContextTLogs", (Object)intermediateDirectory, (Object)taskName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean FileIsUnderPath(java.lang.String fileName, java.lang.String path) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classType.Invoke("FileIsUnderPath", (Object)fileName, (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String EnsureFileTrackerOnPath() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.PlatformNotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("EnsureFileTrackerOnPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ForceOutOfProcTracking(ExecutableType toolType) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException {
        try {
            return (boolean)classType.Invoke("ForceOutOfProcTracking", (Object)toolType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ForceOutOfProcTracking(ExecutableType toolType, java.lang.String dllName, java.lang.String cancelEventName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.io.IOException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.PathTooLongException {
        try {
            return (boolean)classType.Invoke("ForceOutOfProcTracking", (Object)toolType.getJCOInstance(), (Object)dllName, (Object)cancelEventName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetTrackerPath(ExecutableType toolType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        try {
            return (java.lang.String)classType.Invoke("GetTrackerPath", (Object)toolType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetTrackerPath(ExecutableType toolType, java.lang.String rootPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.NotImplementedException, system.PlatformNotSupportedException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classType.Invoke("GetTrackerPath", (Object)toolType.getJCOInstance(), (Object)rootPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetFileTrackerPath(ExecutableType toolType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        try {
            return (java.lang.String)classType.Invoke("GetFileTrackerPath", (Object)toolType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetFileTrackerPath(ExecutableType toolType, java.lang.String rootPath) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.NotImplementedException, system.PlatformNotSupportedException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classType.Invoke("GetFileTrackerPath", (Object)toolType.getJCOInstance(), (Object)rootPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String TrackerResponseFileArguments(java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            return (java.lang.String)classType.Invoke("TrackerResponseFileArguments", (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String TrackerArguments(java.lang.String command, java.lang.String arguments, java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.NotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("TrackerArguments", (Object)command, (Object)arguments, (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String TrackerArguments(java.lang.String command, java.lang.String arguments, java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles, java.lang.String cancelEventName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            return (java.lang.String)classType.Invoke("TrackerArguments", (Object)command, (Object)arguments, (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles, (Object)cancelEventName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Process StartProcess(java.lang.String command, java.lang.String arguments, ExecutableType toolType, java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles, java.lang.String cancelEventName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.OutOfMemoryException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.RankException, system.resources.MissingManifestResourceException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objStartProcess = (JCObject)classType.Invoke("StartProcess", (Object)command, (Object)arguments, (Object)toolType.getJCOInstance(), (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles, (Object)cancelEventName);
            return new Process(objStartProcess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Process StartProcess(java.lang.String command, java.lang.String arguments, ExecutableType toolType, java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.RankException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            JCObject objStartProcess = (JCObject)classType.Invoke("StartProcess", (Object)command, (Object)arguments, (Object)toolType.getJCOInstance(), (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles);
            return new Process(objStartProcess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Process StartProcess(java.lang.String command, java.lang.String arguments, ExecutableType toolType, java.lang.String intermediateDirectory, java.lang.String rootFiles) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.RankException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            JCObject objStartProcess = (JCObject)classType.Invoke("StartProcess", (Object)command, (Object)arguments, (Object)toolType.getJCOInstance(), (Object)intermediateDirectory, (Object)rootFiles);
            return new Process(objStartProcess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Process StartProcess(java.lang.String command, java.lang.String arguments, ExecutableType toolType, java.lang.String rootFiles) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.RankException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            JCObject objStartProcess = (JCObject)classType.Invoke("StartProcess", (Object)command, (Object)arguments, (Object)toolType.getJCOInstance(), (Object)rootFiles);
            return new Process(objStartProcess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Process StartProcess(java.lang.String command, java.lang.String arguments, ExecutableType toolType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.RankException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.io.IOException {
        try {
            JCObject objStartProcess = (JCObject)classType.Invoke("StartProcess", (Object)command, (Object)arguments, (Object)toolType.getJCOInstance());
            return new Process(objStartProcess);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean FileIsExcludedFromDependencies(java.lang.String fileName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classType.Invoke("FileIsExcludedFromDependencies", (Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String CreateRootingMarkerResponseFile(java.lang.String rootMarker) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.FormatException, system.NullReferenceException {
        try {
            return (java.lang.String)classType.Invoke("CreateRootingMarkerResponseFile", (Object)rootMarker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String EnsureFileTrackerOnPath(java.lang.String rootPath) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.PlatformNotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("EnsureFileTrackerOnPath", (Object)rootPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String FindTrackerOnPath() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            return (java.lang.String)classType.Invoke("FindTrackerOnPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String TrackerResponseFileArguments(java.lang.String dllName, java.lang.String intermediateDirectory, java.lang.String rootFiles, java.lang.String cancelEventName) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.io.PathTooLongException {
        try {
            return (java.lang.String)classType.Invoke("TrackerResponseFileArguments", (Object)dllName, (Object)intermediateDirectory, (Object)rootFiles, (Object)cancelEventName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String TrackerCommandArguments(java.lang.String command, java.lang.String arguments) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        try {
            return (java.lang.String)classType.Invoke("TrackerCommandArguments", (Object)command, (Object)arguments);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}