package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: dqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqf extends Fragment {
    private static boolean d = false;
    private static boolean e = false;
    public int a;
    public dqv b;
    boolean c = false;

    private final void a(int i, Intent intent, int i2) {
        a(i, intent, i2, (int[]) null);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        if (!d) {
            boolean z = true;
            d = true;
            qub a2 = qub.a((Context) getActivity());
            int i = Build.VERSION.SDK_INT;
            if (a2.a("com.google", getActivity().getPackageName()).length <= 0) {
                z = false;
            }
            e = z;
        }
        return e;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
            this.c = true;
        }
        this.a = getArguments().getInt("ARG_NETWORK_TYPE");
        dqv dqv = new dqv(getActivity(), this.a);
        this.b = dqv;
        dqv.a(true);
        a();
        if (!jkr.c()) {
            getLoaderManager().initLoader(0, (Bundle) null, this.b);
        } else if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
            getLoaderManager().initLoader(0, (Bundle) null, this.b);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.common_fragment_network_usage_view, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.content_recycler_view);
        dqv dqv = this.b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new abk());
        recyclerView.setAdapter(dqv);
        return inflate;
    }

    private final void a(int i, Intent intent, int i2, int[] iArr) {
        int i3;
        if (this.b != null) {
            dqt dqt = new dqt(getActivity(), i, this.a, this.c);
            if (intent == null || getActivity().getPackageManager().resolveActivity(intent, 65536) == null) {
                dqt.e = false;
            } else {
                dqt.c = intent;
                dqt.e = true;
            }
            if (iArr != null && (r8 = iArr.length) > 0) {
                for (int i4 : iArr) {
                    if (izi.b(i4)) {
                        dqt.g.add(Integer.valueOf(i4 & 268435200));
                    } else {
                        dqt.h.add(Integer.valueOf(i4));
                    }
                }
            }
            dqt.d = dqt.a.getText(i2);
            dqv dqv = this.b;
            Object obj = dqv.a.get(Integer.valueOf(dqt.a()));
            dqv.a.put(Integer.valueOf(dqt.a()), dqt);
            int a2 = dqt.a();
            ou ouVar = dqv.e;
            Integer valueOf = Integer.valueOf(a2);
            ouVar.put(valueOf, valueOf);
            List list = dqt.g;
            for (int i5 = 0; i5 < list.size(); i5++) {
                dqv.e.put((Integer) list.get(i5), Integer.valueOf(a2));
            }
            List list2 = dqt.h;
            for (int i6 = 0; i6 < list2.size(); i6++) {
                dqv.e.put((Integer) list2.get(i6), Integer.valueOf(a2));
            }
            if (obj == null) {
                dqv.f.add(Integer.valueOf(dqt.a()));
                i3 = dqv.f.size() - 1;
            } else {
                i3 = dqv.f.indexOf(Integer.valueOf(a2));
            }
            if (dqv.e(a2, i3)) {
                return;
            }
            if (obj != null) {
                dqv.K(i3);
            } else {
                dqv.L(i3);
            }
        }
    }

    public final void a() {
        a(0, (Intent) null, R.string.common_miscellaneous_title);
        if (b()) {
            a(9216, (Intent) null, R.string.common_plus_settings_title);
        }
        if (b()) {
            a(3584, (Intent) null, R.string.common_games_settings_title);
        }
        if (b()) {
            a(3328, (Intent) null, R.string.common_fitness_settings_title);
        }
        a(1536, new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS"), R.string.common_location_settings_title, new int[]{10240});
        if (b()) {
            a(2816, drm.a((Context) getActivity()), R.string.core_data_management_title);
        }
        a(2304, (Intent) null, R.string.common_cast_nearby_title);
        if (b()) {
            a(5376, (Intent) null, R.string.common_contacts_title, new int[]{289669121, 289669122, 289669123, 289669124, 306446337, 306446338, 306446339, 306446340, 558104577, 558104578, 558104579, 558104580, 574881793, 574881794, 574881795, 574881796, 826540033, 826540034, 826540035, 826540036, 843317249, 843317250, 843317251, 843317252, 273154049, 273154050, 273154051, 541589505, 541589506, 541589507, 810024961, 810024962, 810024963, 1970300020});
        }
        a(1033, (Intent) null, R.string.common_ota_title, new int[]{1970300020});
        a(1792, (Intent) null, R.string.common_android_wear_title);
        a(9728, jhg.h("com.google.android.gms.nearby.settings.NearbySettingsActivity"), R.string.common_nearby_title);
    }
}
