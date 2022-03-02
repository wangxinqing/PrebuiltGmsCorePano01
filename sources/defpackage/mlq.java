package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.v2.model.PageData;
import java.util.ArrayList;

/* renamed from: mlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mlq extends Fragment implements mfz, icb {
    public mlp a;
    private String b;
    private PageData c;
    private ArrayList d;
    private boolean e;

    public static mlq a(String str, PageData pageData, ArrayList arrayList) {
        mlq mlq = new mlq();
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelableArrayList("contacts", arrayList);
        mlq.setArguments(bundle);
        return mlq;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mlp) mfy.a(mlp.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments().getString("accountName");
        this.c = (PageData) getArguments().getParcelable("pageData");
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("contacts");
        this.d = parcelableArrayList;
        this.e = parcelableArrayList != null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_success, viewGroup, false);
        NetworkImageView networkImageView = (NetworkImageView) inflate.findViewById(R.id.fm_success_header_image);
        networkImageView.setDefaultImageResId(R.drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(R.drawable.fm_img_bookend_header_default);
        this.a.b().b(20);
        if (this.c.a.containsKey(1)) {
            if (this.e) {
                a(networkImageView, R.dimen.fm_product_intro_image_size);
            } else {
                a(networkImageView, R.dimen.fm_bookend_image_size);
            }
            networkImageView.setImageUrl((String) this.c.a.get(1), mgd.a());
        }
        if (this.c.a.containsKey(2)) {
            mgh.a((TextView) inflate.findViewById(R.id.fm_success_title_text), (String) this.c.a.get(2), new mgb(this.c, this, this.b));
        }
        if (this.c.a.containsKey(3)) {
            mgh.a((TextView) inflate.findViewById(R.id.fm_success_body_text), (String) this.c.a.get(3), new mgb(this.c, this, this.b));
        }
        if (this.e && !this.d.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fm_success_members_list);
            recyclerView.setVisibility(0);
            inflate.findViewById(R.id.fm_success_members_list_divider_start).setVisibility(0);
            getContext();
            recyclerView.setLayoutManager(new abk());
            recyclerView.setAdapter(new mgs(this.d, this.a.v(), (wli) null, false, getContext()));
        } else {
            ((RecyclerView) inflate.findViewById(R.id.fm_success_members_list)).setVisibility(4);
            inflate.findViewById(R.id.fm_success_members_list_divider_start).setVisibility(4);
        }
        Button button = (Button) inflate.findViewById(R.id.fm_success_continue_button);
        if (this.c.a.containsKey(4)) {
            button.setText((CharSequence) this.c.a.get(4));
        }
        button.setOnClickListener(new mlo(this));
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    private final void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(i);
        layoutParams.width = (int) getResources().getDimension(i);
        view.setLayoutParams(layoutParams);
    }

    public final void a(ConnectionResult connectionResult) {
        this.e = false;
        ith ith = mfv.a;
        this.a.b().a(2, 9);
    }
}
