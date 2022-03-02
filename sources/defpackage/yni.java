package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.List;

/* renamed from: yni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yni extends ymc implements AdapterView.OnItemClickListener {
    private final void i() {
        ((TextView) getActivity().findViewById(R.id.empty_text)).setText("");
        getActivity().findViewById(R.id.empty_view).setVisibility(8);
    }

    public abstract ynh a(Context context);

    public abstract CharSequence d();

    public abstract CharSequence e();

    public abstract Intent f();

    /* renamed from: g */
    public final ynh getListAdapter() {
        return (ynh) super.getListAdapter();
    }

    /* access modifiers changed from: protected */
    public final ynh h() {
        ynh g = getListAdapter();
        if (g != null) {
            return g;
        }
        ynh a = a((Context) getActivity());
        setListAdapter(a);
        return a;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b();
        getListView().setOnItemClickListener(this);
        TextView textView = (TextView) getActivity().findViewById(R.id.empty_text);
        textView.setAutoLinkMask(15);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.a.a(intent.getStringExtra("deviceAddress"));
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        Object item = getListAdapter().getItem(i);
        if (item instanceof yxi) {
            yxi yxi = (yxi) item;
            ApplicationInfo d = yxi.d();
            if (d != null) {
                str = d.packageName;
            } else {
                str = null;
            }
            Account account = this.a.a;
            String c = yxi.c();
            String a = yxi.a();
            String b = yxi.b();
            boolean e = yxi.e();
            String g = yxi.g();
            String h = yxi.h();
            String i2 = yxi.i();
            boolean j2 = yxi.j();
            boolean f = yxi.f();
            Intent intent = new Intent("com.google.android.gms.plus.action.MANAGE_APP");
            intent.putExtra("com.google.android.gms.plus.ACCOUNT", account);
            intent.putExtra("com.google.android.gms.plus.APP_ID", c);
            intent.putExtra("com.google.android.gms.plus.APP_PACKAGE", str);
            intent.putExtra("com.google.android.gms.plus.APP_NAME", a);
            intent.putExtra("com.google.android.gms.plus.APP_ICON_URL", b);
            intent.putExtra("com.google.android.gms.plus.APP_IS_ASPEN", e);
            intent.putExtra("com.google.android.gms.plus.APP_SCOPES", g);
            intent.putExtra("com.google.android.gms.plus.APP_REVOKE_HANDLE", h);
            intent.putExtra("com.google.android.gms.plus.APP_REVOKE_MESSAGE", i2);
            intent.putExtra("com.google.android.gms.plus.APP_HAS_CONN_READ", j2);
            intent.putExtra("com.google.android.gms.plus.APP_IS_FITNESS", f);
            getActivity().startActivityForResult(intent, 1);
            this.a.a(c(), yxi.e() ? ial.e : ial.f);
        } else if (item instanceof BleDevice) {
            Intent intent2 = new Intent();
            intent2.setClassName(getActivity(), "com.google.android.gms.plus.apps.ManageDeviceActivity");
            intent2.putExtra("device", (BleDevice) item);
            startActivityForResult(intent2, 1);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 100) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent f = f();
        if (!jhg.a((Context) getActivity(), f)) {
            iah.a(getActivity(), f, 0);
            return true;
        }
        startActivity(f);
        return true;
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.add(0, 100, 100, R.string.common_list_apps_menu_help);
    }

    private final void a(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        ((TextView) getActivity().findViewById(R.id.empty_text)).setText(charSequence);
        getActivity().findViewById(R.id.empty_view).setVisibility(0);
    }

    public final void a() {
        if (getActivity() != null) {
            ynh h = h();
            int i = this.a.c;
            if (i == 0) {
                setListShown(true);
                h.a(this.a.d, false);
                List list = this.a.f;
                h.a.clear();
                if (list != null) {
                    h.a.addAll(list);
                }
                h.notifyDataSetChanged();
                if (h.getCount() == 0) {
                    a(d());
                } else {
                    i();
                }
            } else if (i == 2) {
                setListShown(true);
                a((CharSequence) getString(R.string.plus_list_apps_no_accounts));
                h.b();
            } else if (i != 3) {
                i();
                setListShown(true);
                if (!this.a.d.isEmpty()) {
                    h.a(this.a.d, true);
                }
            } else {
                setListShown(true);
                a(e());
                h.b();
            }
        }
    }
}
