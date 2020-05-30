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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DialogResult;
import system.runtime.remoting.ObjRef;
import system.drawing.Color;
import system.drawing.Font;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.FontDialog, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FontDialog extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.FontDialog";
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

    public FontDialog(Object instance) throws Throwable {
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

    public static FontDialog castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FontDialog(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FontDialog() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Reset() throws Throwable {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult ShowDialog() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.io.FileNotFoundException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShowDialog = (JCObject)classInstance.Invoke("ShowDialog");
            return new DialogResult(objShowDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowSimulations() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowSimulations");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowSimulations(boolean AllowSimulations) throws Throwable {
        try {
            classInstance.Set("AllowSimulations", AllowSimulations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowVectorFonts() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowVectorFonts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowVectorFonts(boolean AllowVectorFonts) throws Throwable {
        try {
            classInstance.Set("AllowVectorFonts", AllowVectorFonts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowVerticalFonts() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowVerticalFonts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowVerticalFonts(boolean AllowVerticalFonts) throws Throwable {
        try {
            classInstance.Set("AllowVerticalFonts", AllowVerticalFonts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowScriptChange() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowScriptChange");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowScriptChange(boolean AllowScriptChange) throws Throwable {
        try {
            classInstance.Set("AllowScriptChange", AllowScriptChange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Color");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColor(Color Color) throws Throwable {
        try {
            classInstance.Set("Color", (Object)Color.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFixedPitchOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("FixedPitchOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFixedPitchOnly(boolean FixedPitchOnly) throws Throwable {
        try {
            classInstance.Set("FixedPitchOnly", FixedPitchOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Font");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFont(Font Font) throws Throwable {
        try {
            classInstance.Set("Font", (Object)Font.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFontMustExist() throws Throwable {
        try {
            return (boolean)classInstance.Get("FontMustExist");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFontMustExist(boolean FontMustExist) throws Throwable {
        try {
            classInstance.Set("FontMustExist", FontMustExist);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaxSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxSize(int MaxSize) throws Throwable {
        try {
            classInstance.Set("MaxSize", MaxSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinSize() throws Throwable {
        try {
            return (int)classInstance.Get("MinSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinSize(int MinSize) throws Throwable {
        try {
            classInstance.Set("MinSize", MinSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getScriptsOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ScriptsOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setScriptsOnly(boolean ScriptsOnly) throws Throwable {
        try {
            classInstance.Set("ScriptsOnly", ScriptsOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowApply() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowApply");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowApply(boolean ShowApply) throws Throwable {
        try {
            classInstance.Set("ShowApply", ShowApply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowColor() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowColor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowColor(boolean ShowColor) throws Throwable {
        try {
            classInstance.Set("ShowColor", ShowColor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowEffects() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowEffects");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowEffects(boolean ShowEffects) throws Throwable {
        try {
            classInstance.Set("ShowEffects", ShowEffects);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowHelp() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowHelp(boolean ShowHelp) throws Throwable {
        try {
            classInstance.Set("ShowHelp", ShowHelp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        try {
            classInstance.Set("Tag", (Object)Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addApply(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Apply", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeApply(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Apply", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}