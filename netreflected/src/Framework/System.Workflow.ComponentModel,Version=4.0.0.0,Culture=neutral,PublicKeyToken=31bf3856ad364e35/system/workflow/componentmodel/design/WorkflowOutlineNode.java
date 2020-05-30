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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.Activity;
import system.runtime.remoting.ObjRef;
import system.drawing.Color;
import system.drawing.Rectangle;
import system.windows.forms.ContextMenu;
import system.windows.forms.ContextMenuStrip;
import system.windows.forms.TreeNode;
import system.drawing.Font;
import system.windows.forms.TreeNodeCollection;
import system.windows.forms.TreeView;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.WorkflowOutlineNode, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowOutlineNode extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.WorkflowOutlineNode";
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

    public WorkflowOutlineNode(Object instance) throws Throwable {
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

    public static WorkflowOutlineNode castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowOutlineNode(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowOutlineNode(Activity activity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)activity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void RefreshNode() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationErrorsException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.runtime.interopservices.ExternalException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            classInstance.Invoke("RefreshNode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnActivityRename(java.lang.String newName) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.security.SecurityException {
        try {
            classInstance.Invoke("OnActivityRename", (Object)newName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.Win32Exception, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("BeginEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.componentmodel.Win32Exception {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Collapse(boolean ignoreChildren) throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Collapse", ignoreChildren);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Collapse() throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Collapse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndEdit(boolean cancel) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("EndEdit", cancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureVisible() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("EnsureVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Expand() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Expand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ExpandAll() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("ExpandAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetNodeCount(boolean includeSubTrees) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetNodeCount", includeSubTrees);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove() throws Throwable, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Remove");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Toggle() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.OutOfMemoryException, system.ArgumentException {
        try {
            classInstance.Invoke("Toggle");
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
    
    
    public Activity getActivity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Activity");
            return new Activity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColor(Color BackColor) throws Throwable {
        try {
            classInstance.Set("BackColor", (Object)BackColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getChecked() throws Throwable {
        try {
            return (boolean)classInstance.Get("Checked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChecked(boolean Checked) throws Throwable {
        try {
            classInstance.Set("Checked", Checked);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenu getContextMenu() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenu");
            return new ContextMenu(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextMenu(ContextMenu ContextMenu) throws Throwable {
        try {
            classInstance.Set("ContextMenu", (Object)ContextMenu.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip getContextMenuStrip() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenuStrip");
            return new ContextMenuStrip(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextMenuStrip(ContextMenuStrip ContextMenuStrip) throws Throwable {
        try {
            classInstance.Set("ContextMenuStrip", (Object)ContextMenuStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getFirstNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FirstNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setForeColor(Color ForeColor) throws Throwable {
        try {
            classInstance.Set("ForeColor", (Object)ForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FullPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getImageIndex() throws Throwable {
        try {
            return (int)classInstance.Get("ImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageIndex(int ImageIndex) throws Throwable {
        try {
            classInstance.Set("ImageIndex", ImageIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getImageKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageKey(java.lang.String ImageKey) throws Throwable {
        try {
            classInstance.Set("ImageKey", (Object)ImageKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndex() throws Throwable {
        try {
            return (int)classInstance.Get("Index");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEditing() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEditing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsExpanded() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsExpanded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSelected() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSelected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsVisible() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getLastNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LastNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLevel() throws Throwable {
        try {
            return (int)classInstance.Get("Level");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getNextNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NextNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getNextVisibleNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NextVisibleNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getNodeFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NodeFont");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNodeFont(Font NodeFont) throws Throwable {
        try {
            classInstance.Set("NodeFont", (Object)NodeFont.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNodeCollection getNodes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Nodes");
            return new TreeNodeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getPrevNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrevNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getPrevVisibleNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrevVisibleNode");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSelectedImageIndex() throws Throwable {
        try {
            return (int)classInstance.Get("SelectedImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectedImageIndex(int SelectedImageIndex) throws Throwable {
        try {
            classInstance.Set("SelectedImageIndex", SelectedImageIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSelectedImageKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SelectedImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectedImageKey(java.lang.String SelectedImageKey) throws Throwable {
        try {
            classInstance.Set("SelectedImageKey", (Object)SelectedImageKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStateImageKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("StateImageKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStateImageKey(java.lang.String StateImageKey) throws Throwable {
        try {
            classInstance.Set("StateImageKey", (Object)StateImageKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getStateImageIndex() throws Throwable {
        try {
            return (int)classInstance.Get("StateImageIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStateImageIndex(int StateImageIndex) throws Throwable {
        try {
            classInstance.Set("StateImageIndex", StateImageIndex);
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

    public java.lang.String getText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable {
        try {
            classInstance.Set("Text", (Object)Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolTipText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ToolTipText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolTipText(java.lang.String ToolTipText) throws Throwable {
        try {
            classInstance.Set("ToolTipText", (Object)ToolTipText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeView getTreeView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TreeView");
            return new TreeView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}