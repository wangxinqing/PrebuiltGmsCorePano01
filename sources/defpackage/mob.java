package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import java.util.HashMap;
import java.util.List;

/* renamed from: mob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mob extends Fragment implements mne {
    public RecyclerView a;
    mng b = null;
    public mnz c;
    public String d;
    public boolean e;
    public ViewerDataModel f;
    public String g;
    public mhk h;
    public DashboardDataModel i;
    private ProgressBar j;
    private ProgressDialog k = null;
    private String l = "";
    private act m;
    private View n;
    private Toolbar o;
    private boolean p;
    private boolean q;
    private boolean r;

    public final void a() {
        a(getString(R.string.fm_just_a_sec_message));
        b();
    }

    public final void b() {
        mfv.c("FamilyDashboardFragment", "Refreshing the family dashboard", new Object[0]);
        this.i = null;
        this.h = null;
        getActivity().getSupportLoaderManager().destroyLoader(2);
        getActivity().getSupportLoaderManager().restartLoader(4, (Bundle) null, new mny(this));
        getActivity().getSupportLoaderManager().restartLoader(2, (Bundle) null, new mnw(this));
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i2;
        PageData pageData;
        HashMap hashMap;
        PageData pageData2;
        HashMap hashMap2;
        PageData pageData3;
        HashMap hashMap3;
        if (this.i != null && this.h != null) {
            d();
            g();
            this.f = this.i.d;
            if (this.n != null) {
                List list = this.h.a;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    i2 = 1;
                    if (i3 < size) {
                        MemberDataModel memberDataModel = (MemberDataModel) list.get(i3);
                        i3++;
                        if (memberDataModel.g == 1) {
                            this.g = memberDataModel.d;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                mfv.c("FamilyDashboardFragment", "Notifying data set changed.", new Object[0]);
                mng mng = this.b;
                mhk mhk = this.h;
                DashboardDataModel dashboardDataModel = this.i;
                mng.g = mhk.a;
                mng.h = mhk.b;
                mng.i = dashboardDataModel.d;
                mng.k = dashboardDataModel.a.a(21);
                mng.l = dashboardDataModel.a.a(20);
                mng.m = dashboardDataModel.a.a(28);
                mng.j = mhk.c;
                mng.n = mhk.e;
                boolean z = (!mng.i.a(1) || (pageData3 = mng.l) == null || (hashMap3 = pageData3.a) == null || !hashMap3.containsKey(18)) ? false : mng.g.size() + mng.h.size() < mng.j;
                boolean z2 = (!mng.i.a(3) || (pageData2 = mng.k) == null || (hashMap2 = pageData2.a) == null) ? false : hashMap2.containsKey(18);
                boolean z3 = (!mng.i.a(4) || (pageData = mng.m) == null || (hashMap = pageData.a) == null) ? false : hashMap.containsKey(18);
                mng.f = 0;
                if (z) {
                    int[] iArr = mng.e;
                    mng.f = 1;
                    iArr[0] = 3;
                } else {
                    i2 = 0;
                }
                if (z2) {
                    int[] iArr2 = mng.e;
                    int i4 = i2 + 1;
                    mng.f = i4;
                    iArr2[i2] = 4;
                    i2 = i4;
                }
                if (z3) {
                    int[] iArr3 = mng.e;
                    mng.f = i2 + 1;
                    iArr3[i2] = 5;
                }
                this.a.setAdapter(this.b);
                this.b.as();
                this.c.a(this.i);
            } else {
                mfv.d("FamilyDashboardFragment", "Cannot attach data to null view", new Object[0]);
            }
            this.o.h().clear();
            this.o.e(R.menu.fm_dashboard_menu);
            this.o.s = new mnq(this);
            Menu h2 = this.o.h();
            String str = this.h.e;
            PageDataMap pageDataMap = this.i.a;
            if (this.f.a(0)) {
                h2.findItem(R.id.fm_delete_family_option).setTitle((CharSequence) pageDataMap.a(34).a.get(29));
            } else {
                h2.findItem(R.id.fm_delete_family_option).setVisible(false);
            }
            if (this.f.c.contains(str)) {
                h2.findItem(R.id.fm_remove_parent_privilege_option).setTitle((CharSequence) pageDataMap.a(34).a.get(26));
            } else {
                h2.findItem(R.id.fm_remove_parent_privilege_option).setVisible(false);
            }
            if (this.f.b.contains(str)) {
                h2.findItem(R.id.fm_leave_family_option).setTitle((CharSequence) pageDataMap.a(34).a.get(24));
            } else {
                h2.findItem(R.id.fm_leave_family_option).setVisible(false);
            }
            if (!h2.hasVisibleItems()) {
                this.o.c();
            }
            DashboardDataModel dashboardDataModel2 = this.i;
            if (dashboardDataModel2.b) {
                mfu.b(getActivity(), new mnp(this)).show();
                return;
            }
            this.c.a(dashboardDataModel2.a);
            mhk mhk2 = this.h;
            if (!mhk2.d) {
                this.c.a(mhk2.f);
                return;
            }
            PageData pageData4 = this.i.e;
            if (pageData4 != null) {
                this.c.b(pageData4);
            } else if (mhk2.g == 3) {
                akax a2 = akax.a(getView(), (int) R.string.fm_message_family_disabled, -2);
                a2.a(R.string.common_learn_more, new mns(this));
                a2.c();
            }
        }
    }

    public final void d() {
        ProgressDialog progressDialog = this.k;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.k = null;
        }
    }

    public final void e() {
        mfu.a(getActivity()).show();
    }

    public final void f() {
        ProgressBar progressBar = this.j;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            View view = this.n;
            if (view == null) {
                mfv.f("FamilyDashboardFragment", "showLoader() access dashboardView with null value", new Object[0]);
            } else {
                view.setClickable(false);
            }
        }
    }

    public final void g() {
        ProgressBar progressBar = this.j;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            View view = this.n;
            if (view == null) {
                mfv.f("FamilyDashboardFragment", "hideLoader() access dashboardView with null value", new Object[0]);
            } else {
                view.setClickable(true);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getSupportLoaderManager().initLoader(4, (Bundle) null, new mny(this));
        getActivity().getSupportLoaderManager().initLoader(2, (Bundle) null, new mnw(this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (mnz) mfy.a(mnz.class, getActivity());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getArguments().getString("accountName");
        this.p = getArguments().getBoolean("hasMemberIntent");
        this.q = getArguments().getBoolean("hasSupervisedMemberIntent");
        this.r = getArguments().getBoolean("hasKidIntent");
        this.e = getArguments().getBoolean("directAdd");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_dashboard, viewGroup, false);
        this.n = inflate;
        this.j = (ProgressBar) inflate.findViewById(R.id.fm_dashboard_progress_bar);
        f();
        RecyclerView recyclerView = (RecyclerView) this.n.findViewById(R.id.fm_member_list_view);
        this.a = recyclerView;
        recyclerView.setVisibility(8);
        Toolbar toolbar = (Toolbar) this.n.findViewById(R.id.fm_toolbar);
        this.o = toolbar;
        mgj.a(toolbar, getString(R.string.fm_family_management_toolbar_title), getActivity());
        getActivity();
        abk abk = new abk();
        this.m = abk;
        this.a.setLayoutManager(abk);
        mfv.c("FamilyDashboardFragment", "Created dashboard adapter", new Object[0]);
        this.b = new mng(getActivity(), this, this.p, this.q, this.r);
        if (bundle != null && bundle.getBoolean("showProgressDialog", false)) {
            if (bundle.getString("progressDialogMessage") != null) {
                a(bundle.getString("progressDialogMessage"));
            } else {
                a(getString(R.string.fm_just_a_sec_message));
            }
        }
        return this.n;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        getActivity().getSupportLoaderManager().destroyLoader(4);
        getActivity().getSupportLoaderManager().destroyLoader(2);
        this.n = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.c = null;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        int i2 = 0;
        if (itemId == R.id.fm_delete_family_option) {
            this.c.b().a(10);
            mfv.c("FamilyDashboardFragment", "Delete family clicked", new Object[0]);
            this.c.f();
            return true;
        }
        MemberDataModel memberDataModel = null;
        if (itemId == R.id.fm_leave_family_option) {
            this.c.b().a(15);
            mfv.c("FamilyDashboardFragment", "Leave family clicked", new Object[0]);
            mnz mnz = this.c;
            mhk mhk = this.h;
            String str = mhk.e;
            List list = mhk.a;
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MemberDataModel memberDataModel2 = (MemberDataModel) list.get(i2);
                i2++;
                if (memberDataModel2.a.equals(str)) {
                    memberDataModel = memberDataModel2;
                    break;
                }
            }
            mnz.a(memberDataModel, this.g, true);
            return true;
        } else if (itemId != R.id.fm_remove_parent_privilege_option) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.c.b().a(24);
            mfv.c("FamilyDashboardFragment", "Remove parent privilege clicked", new Object[0]);
            f();
            getActivity().getSupportLoaderManager().restartLoader(6, (Bundle) null, new mnu(this, this.h.e, apix.MEMBER));
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.k != null) {
            bundle.putBoolean("showProgressDialog", true);
            bundle.putString("progressDialogMessage", this.l);
            this.k.dismiss();
        }
    }

    public final void a(String str) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), mfx.b(getActivity().getIntent()));
        this.k = progressDialog;
        progressDialog.setIndeterminate(true);
        this.k.setCanceledOnTouchOutside(false);
        this.k.setMessage(str);
        this.k.setCanceledOnTouchOutside(false);
        this.l = str;
        this.k.show();
    }
}
