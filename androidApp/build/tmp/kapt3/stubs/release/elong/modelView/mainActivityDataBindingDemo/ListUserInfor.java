package elong.modelView.mainActivityDataBindingDemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u0007\b\u0016\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R(\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00068G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR4\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lelong/modelView/mainActivityDataBindingDemo/ListUserInfor;", "Landroidx/databinding/BaseObservable;", "users", "Landroidx/databinding/ObservableArrayList;", "Lelong/modelView/mainActivityDataBindingDemo/User;", "totalUser", "", "(Landroidx/databinding/ObservableArrayList;Ljava/lang/Integer;)V", "()V", "value", "TotalUser", "getTotalUser", "()Ljava/lang/Integer;", "setTotalUser", "(Ljava/lang/Integer;)V", "Users", "getUsers", "()Landroidx/databinding/ObservableArrayList;", "setUsers", "(Landroidx/databinding/ObservableArrayList;)V", "Ljava/lang/Integer;", "add", "", "view", "Landroid/view/View;", "user", "remove", "androidApp_release"})
public final class ListUserInfor extends androidx.databinding.BaseObservable {
    private androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> users;
    private java.lang.Integer totalUser;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getTotalUser() {
        return null;
    }
    
    public final void setTotalUser(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    private final void add(elong.modelView.mainActivityDataBindingDemo.User user) {
    }
    
    /**
     * Bổ sung 1 số hàm để xử lý sự kiện trên zao diện
     */
    public final void add(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ListUserInfor(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<elong.modelView.mainActivityDataBindingDemo.User> users, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalUser) {
        super();
    }
    
    public ListUserInfor() {
        super();
    }
}