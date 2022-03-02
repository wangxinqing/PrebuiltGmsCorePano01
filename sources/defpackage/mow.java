package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.v2.model.PageData;
import java.util.ArrayList;

/* renamed from: mow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mow extends Fragment implements mop, mfz {
    public mor a = null;
    public String b;
    public ArrayList c;
    public mou d;
    private RelativeLayout e;
    private View f;
    private PageData g;
    private PageData h;

    public final mhi a() {
        return this.d.b();
    }

    public final void b() {
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    public final void c() {
        RelativeLayout relativeLayout = this.e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public final void d() {
        mfu.a(getActivity()).show();
    }

    public final void e() {
        this.a.c();
        this.a.as();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = (mou) mfy.a(mou.class, getActivity());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments().getString("accountName");
        this.c = getArguments().getParcelableArrayList("MEMBERS");
        this.g = (PageData) getArguments().getParcelable("mppd");
        this.h = (PageData) getArguments().getParcelable("mpnepd");
        if (bundle != null) {
            this.c = bundle.getParcelableArrayList("MEMBERS");
        }
        this.a = new mor(this, this.c, (String) this.g.a.get(27));
        if (bundle != null && bundle.getBundle("mpvs") != null) {
            this.a.f = bundle.getBundle("mpvs").getString("tmid");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = getArguments().getString("accountName");
        if (this.c.size() == 1) {
            PageData pageData = this.h;
            this.f = layoutInflater.inflate(R.layout.fm_fragment_manage_parents_none_eligible, viewGroup, false);
            if (pageData.a.containsKey(3)) {
                mgh.a((TextView) this.f.findViewById(R.id.fm_manage_parents_none_eligible_body_text), (String) pageData.a.get(3), new mgb(pageData, this, string));
            }
            if (pageData.a.containsKey(2)) {
                mgj.a((Toolbar) this.f.findViewById(R.id.fm_toolbar), (String) pageData.a.get(2), getActivity());
            }
            if (pageData.a.containsKey(28)) {
                mgh.a((TextView) this.f.findViewById(R.id.fm_manage_parents_none_eligible_subheader_text), (String) pageData.a.get(28), new mgb(pageData, this, string));
            }
            return this.f;
        }
        this.f = layoutInflater.inflate(R.layout.fm_fragment_manage_parents, viewGroup, false);
        if (this.g.a.containsKey(3)) {
            mgh.a((TextView) this.f.findViewById(R.id.fm_manage_parents_page_primary_text), (String) this.g.a.get(3), new mgb(this.g, this, string));
        }
        RecyclerView recyclerView = (RecyclerView) this.f.findViewById(R.id.fm_manage_parents_list_view);
        recyclerView.setAdapter(this.a);
        recyclerView.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f.findViewById(R.id.fm_manage_parents_progress_bar_container);
        this.e = relativeLayout;
        relativeLayout.setVisibility(8);
        if (this.g.a.containsKey(2)) {
            mgj.a((Toolbar) this.f.findViewById(R.id.fm_toolbar), (String) this.g.a.get(2), getActivity());
        }
        if (this.g.a.containsKey(12)) {
            mgh.a((TextView) this.f.findViewById(R.id.fm_manage_parents_page_additional_text), (String) this.g.a.get(12), new mgb(this.g, this, string));
        }
        getActivity();
        recyclerView.setLayoutManager(new abk());
        return this.f;
    }

    public final void onDetach() {
        super.onDetach();
        this.d = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mor mor = this.a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("tmid", mor.f);
        bundle.putBundle("mpvs", bundle2);
        bundle.putString("accountName", this.b);
        bundle.putParcelableArrayList("MEMBERS", this.c);
    }

    public final void a(MemberDataModel memberDataModel) {
        apix apix;
        b();
        apix a2 = apix.a(memberDataModel.g);
        if (a2 == apix.MEMBER) {
            apix = apix.PARENT;
        } else {
            apix = a2 == apix.PARENT ? apix.MEMBER : apix.UNKNOWN_FAMILY_ROLE;
        }
        getActivity().getSupportLoaderManager().restartLoader(6, (Bundle) null, new mot(this, memberDataModel.a, apix));
    }
}
