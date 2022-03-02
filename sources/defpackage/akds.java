package defpackage;

import android.os.Bundle;
import com.google.android.pano.chimera.Action;
import com.google.android.pano.widget.ScrollAdapterView;
import java.util.ArrayList;

/* renamed from: akds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akds extends akeg implements akdo, akdp, akdq, akef {
    public final akdt a;

    public akds() {
        akdt akdt = new akdt(this);
        this.a = akdt;
        this.b = akdt;
    }

    public static akds a(ArrayList arrayList) {
        akds akds = new akds();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("actions", arrayList);
        bundle.putString("name", (String) null);
        bundle.putInt("index", -1);
        akds.setArguments(bundle);
        return akds;
    }

    public final void b(Action action) {
        this.a.b(action);
    }

    public final void c(Action action) {
        this.a.c(action);
    }

    public final void d(Action action) {
        this.a.d(action);
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        akdt akdt = this.a;
        akdt.b = new akdr(akdt.a.getActivity());
        akdt.c = false;
        if (bundle != null) {
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("actions");
            int i = bundle.getInt("index", -1);
            if (parcelableArrayList2 != null) {
                int size = parcelableArrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    akdt.b.a((Action) parcelableArrayList2.get(i2));
                }
                if (i >= 0 && i < parcelableArrayList2.size()) {
                    akdt.e = i;
                }
                akdt.c = true;
            }
        } else {
            int i3 = akdt.a.getArguments().getInt("index", -1);
            if (i3 != -1) {
                akdt.e = i3;
            }
        }
        akdt.a.getArguments().getString("name");
        if (!(akdt.a.getArguments() == null || akdt.c || (parcelableArrayList = akdt.a.getArguments().getParcelableArrayList("actions")) == null)) {
            int size2 = parcelableArrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                boolean z = akdt.d;
                if (((Action) parcelableArrayList.get(i4)).h && akdt.e == -1) {
                    akdt.e = i4;
                }
                akdt.b.a((Action) parcelableArrayList.get(i4));
            }
        }
        akdr akdr = akdt.b;
        akdr.c = akdt;
        akdr.d = akdt;
        akdr.e = akdt;
    }

    public final void onResume() {
        super.onResume();
        akdt akdt = this.a;
        ScrollAdapterView a2 = akdt.a();
        a2.a((akgs) akdt.b);
        akge akge = akdt.h;
        akdr akdr = akdt.b;
        if (akge != akdr) {
            akdr.f = a2;
            akdt.h = akdr;
            ScrollAdapterView scrollAdapterView = akdt.i;
            if (scrollAdapterView != null) {
                scrollAdapterView.setAdapter(akdt.h);
            }
        }
        if (akdt.e != -1) {
            akdt.a().setSelection(akdt.e);
            akdt.e = -1;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        akdt akdt = this.a;
        if (akdt.g.getView() != null) {
            bundle.putParcelableArrayList("actions", new ArrayList(akdt.b.b));
            bundle.putInt("index", akdt.a().m);
        }
    }

    public final void a(Action action) {
        this.a.a(action);
    }
}
