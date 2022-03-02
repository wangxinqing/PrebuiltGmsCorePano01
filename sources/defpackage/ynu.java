package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ynu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynu extends ymc implements LoaderManager.LoaderCallbacks, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, DialogInterface.OnClickListener, ynn, yns, ynw {
    public final ArrayList b = new ArrayList();
    public ynt c;
    public ynq d;
    private ApplicationEntity e;
    private String f;
    private CharSequence g;
    private String h;
    private String i;
    private zng j;
    private ynx k;

    private final void e() {
        ymx.a();
        if (!ymx.b(getActivity(), 2)) {
            if (getListAdapter() != null) {
                yno d2 = getListAdapter();
                d2.b.clear();
                d2.c = false;
                d2.notifyDataSetChanged();
            }
            this.h = this.a.a.name;
            this.i = null;
            setListShown(false);
            getLoaderManager().restartLoader(200, (Bundle) null, this);
        }
    }

    private final void f() {
        if (getListAdapter() != null) {
            yno d2 = getListAdapter();
            d2.b.clear();
            d2.c = false;
            d2.notifyDataSetInvalidated();
        }
        ymx.a();
        if (ymx.b(getActivity(), 2)) {
            ymx.a();
            setEmptyText(ymx.a(getActivity(), 2));
        } else {
            setEmptyText(getString(R.string.plus_list_moments_error));
        }
        setListShown(true);
    }

    public final void a() {
    }

    public final void b(sg sgVar) {
        sgVar.b((int) R.drawable.plus_icon_red_32);
        String str = this.a.a.name;
        if (this.e == null && this.f == null) {
            String[] a = ymb.a((Context) getActivity());
            if (this.j == null) {
                zng zng = new zng(sgVar.g(), a);
                this.j = zng;
                zng.a = zng.getContext().getResources().getString(R.string.plus_app_settings_activity_log_page_label);
                zng.notifyDataSetChanged();
            }
            sgVar.a((int) R.layout.common_action_bar_spinner);
            Spinner spinner = (Spinner) sgVar.a().findViewById(R.id.action_bar_spinner);
            spinner.setOnItemSelectedListener(this);
            spinner.setAdapter(this.j);
            spinner.setVisibility(0);
            spinner.setSelection(this.j.getPosition(str));
            if (a.length == 1) {
                spinner.setBackgroundResource(0);
                spinner.setClickable(false);
            }
        } else {
            sgVar.a((int) R.layout.plus_settings_action_bar_title_sub_title);
            ((TextView) sgVar.a().findViewById(R.id.title)).setText(R.string.plus_app_settings_activity_log_page_label);
            int i2 = Build.VERSION.SDK_INT;
        }
        if (!str.equals(this.h)) {
            e();
        }
    }

    public final FavaDiagnosticsEntity c() {
        return ial.g;
    }

    /* renamed from: d */
    public final yno getListAdapter() {
        return (yno) super.getListAdapter();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b();
        getListView().setOnItemClickListener(this);
        if (bundle == null || !bundle.containsKey("moment_list_app_filter")) {
            this.e = (ApplicationEntity) getArguments().getParcelable("app_filter");
        } else {
            this.e = (ApplicationEntity) bundle.getParcelable("moment_list_app_filter");
        }
        this.f = getArguments().getString("collection_filter");
        this.c = ynt.a((Context) getActivity());
        this.d = ynq.a((Context) getActivity());
        this.c.a((yns) this);
        ApplicationEntity applicationEntity = this.e;
        int i2 = R.string.plus_list_moments_filter_empty_message;
        if (applicationEntity == null && this.f == null) {
            i2 = R.string.plus_list_moments_empty_message;
        }
        this.g = getText(i2);
        if (bundle != null && bundle.containsKey("moment_list_deleted_moments")) {
            this.b.clear();
            this.b.addAll(bundle.getStringArrayList("moment_list_deleted_moments"));
        }
        ymx.a();
        if (!ymx.b(getActivity(), 2)) {
            ApplicationEntity applicationEntity2 = this.e;
            if (applicationEntity2 != null && applicationEntity2.b == null) {
                ynx a = ynx.a((Context) getActivity());
                this.k = a;
                a.a((ynw) this, this.e.d, ymb.b((Context) getActivity()));
                return;
            }
            return;
        }
        f();
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        String str;
        if (i2 == 200) {
            Activity activity = getActivity();
            Account account = this.a.a;
            String str2 = this.f;
            ApplicationEntity applicationEntity = this.e;
            if (applicationEntity != null) {
                str = applicationEntity.d;
            } else {
                str = null;
            }
            return new ynp(activity, account, str2, str, ((Integer) ysu.z.c()).intValue(), this.i);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c.b(this);
        ynx ynx = this.k;
        if (ynx != null) {
            ynx.a((ynw) this);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        zhg a = getListAdapter().getItem(i2);
        if (a != null) {
            Intent intent = new Intent();
            intent.setClassName(getActivity(), "com.google.android.gms.plus.apps.ManageMomentActivity");
            intent.putExtra("account", this.a.a);
            intent.putExtra("app_activity", (MomentEntity) a);
            ApplicationEntity applicationEntity = this.e;
            if (applicationEntity == null) {
                ArrayList arrayList = this.a.d;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    yxi yxi = (yxi) arrayList.get(i3);
                    i3++;
                    if (yxi.c().equals(a.c())) {
                        applicationEntity = ApplicationEntity.a(yxi);
                        break;
                    }
                }
            }
            intent.putExtra("application", applicationEntity);
            getActivity().startActivityForResult(intent, 3);
            this.a.a(ial.g, ial.h);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        String str = (String) this.j.getItem(i2);
        if (!str.equals(this.a.a.name)) {
            this.a.b(str);
            if (!str.equals(this.h)) {
                e();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        MomentsFeed momentsFeed = (MomentsFeed) obj;
        if (loader.getId() == 200) {
            boolean z = true;
            setListShown(true);
            ConnectionResult connectionResult = ((ynp) loader).a;
            if (getListAdapter() == null) {
                setListAdapter(new yno(getActivity(), this));
            }
            if (momentsFeed == null || connectionResult == null || !connectionResult.b()) {
                getLoaderManager().destroyLoader(200);
                f();
                return;
            }
            setEmptyText(this.g);
            this.i = momentsFeed.d;
            yno d2 = getListAdapter();
            List list = momentsFeed.c;
            if (this.i == null) {
                z = false;
            }
            d2.c = z;
            ArrayList arrayList = ((ynu) d2.a).b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                zhg zhg = (zhg) list.get(i2);
                if (!arrayList.contains(zhg.e())) {
                    ArrayList arrayList2 = d2.b;
                    zhg.r();
                    arrayList2.add(zhg);
                }
            }
            d2.notifyDataSetChanged();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 200) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse((String) ysu.w.c()));
        if (!jhg.a((Context) getActivity(), data)) {
            iah.a(getActivity(), data, 0);
            return true;
        }
        startActivity(data);
        return true;
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.add(0, 200, 100, R.string.common_list_apps_menu_help);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("moment_list_app_filter", this.e);
        bundle.putStringArrayList("moment_list_deleted_moments", this.b);
    }

    public final void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.d.a(str, drawable);
            if (getListAdapter() != null) {
                getListAdapter().notifyDataSetChanged();
            }
        }
    }

    public final void a(ynv ynv) {
        if (ynv.a.equals(this.e.d)) {
            this.e = new ApplicationEntity(ynv.b, ynv.c, ynv.a);
        }
    }
}
