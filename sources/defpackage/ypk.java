package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;

/* renamed from: ypk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ypk extends ypl {
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;

    protected static Bundle b(String str, String str2, String str3, String str4) {
        iva.a(str, (Object) "Account name must not be empty.");
        Bundle bundle = new Bundle();
        bundle.putString("accountName", str);
        bundle.putString("plusPageId", str2);
        bundle.putString("client_application_id", str3);
        bundle.putString("calling_package_name", str4);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public View a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract BaseAdapter f();

    /* renamed from: h */
    public final BaseAdapter getListAdapter() {
        return (BaseAdapter) super.getListAdapter();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View a = a();
        if (a != null) {
            getListView().addHeaderView(a);
        }
        getListView().setItemsCanFocus(true);
        getListView().setDividerHeight(0);
        e();
        setListAdapter(f());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.j = arguments.getString("accountName");
        this.k = arguments.getString("plusPageId");
        this.l = arguments.getString("client_application_id");
        this.m = arguments.getString("calling_package_name");
        if (TextUtils.isEmpty(this.l)) {
            this.l = "80";
        }
    }

    public void onStart() {
        super.onStart();
        this.n = true;
    }

    public void onStop() {
        this.n = false;
        super.onStop();
    }
}
