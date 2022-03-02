package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aler  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aler extends Fragment implements alem {
    public aleu a;
    public ales b;
    public String c;
    public LatLngBounds d;
    public Integer e;
    public Integer f;
    private String g;
    private boolean h;
    private Intent i;

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            this.h = false;
            if (i3 == -1) {
                Activity activity = getActivity();
                iva.a((Object) intent, (Object) "intent must not be null");
                iva.a((Object) activity, (Object) "context must not be null");
                rhq rhq = (rhq) ivy.a(intent, "selected_place", PlaceEntity.CREATOR);
                this.g = rhq.p().toString();
                ales ales = this.b;
                if (ales == null || this.a == null) {
                    throw new IllegalStateException("onActivityResult called before StateController gave us our dependencies.");
                }
                ales.a();
                aucd aucd = ales.a;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aodu aodu = (aodu) aucd.b;
                aodu aodu2 = aodu.f;
                aodu.c = 3;
                aodu.a |= 64;
                this.a.a(rhq);
                return;
            }
            this.a.b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = bundle.getString("last_query");
            this.h = bundle.getBoolean("is_activity_open");
            this.i = (Intent) bundle.getParcelable("autocomplete_result");
            this.d = (LatLngBounds) bundle.getParcelable("map_bounds");
        }
        if (!this.h) {
            rll rll = new rll();
            String str = this.g;
            if (str != null) {
                rll.a.putExtra("initial_query", str);
                this.g = null;
            }
            try {
                android.app.Activity containerActivity = getActivity().getContainerActivity();
                Resources.Theme theme = containerActivity.getTheme();
                TypedValue typedValue = new TypedValue();
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(16843827, typedValue, true)) {
                    if (!rll.a.hasExtra("primary_color")) {
                        rll.a.putExtra("primary_color", typedValue.data);
                    }
                }
                if (theme.resolveAttribute(16843828, typedValue2, true)) {
                    if (!rll.a.hasExtra("primary_color_dark")) {
                        rll.a.putExtra("primary_color_dark", typedValue2.data);
                    }
                }
                hxj hxj = hxj.a;
                hxz.l(containerActivity);
                Intent intent = rll.a;
                Integer num = this.e;
                if (num != null) {
                    intent.putExtra("primary_color", num);
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    intent.putExtra("primary_color_dark", num2);
                }
                String str2 = this.c;
                if (str2 != null) {
                    intent.putExtra("account_name", str2);
                }
                LatLngBounds latLngBounds = this.d;
                if (latLngBounds != null) {
                    intent.putExtra("bounds", latLngBounds);
                }
                String a2 = jhg.a(getActivity());
                if (!TextUtils.isEmpty(a2)) {
                    intent.putExtra("forwarded_app", a2);
                }
                intent.putExtra("origin", 3);
                startActivityForResult(intent, 1);
                this.h = true;
            } catch (hxw | hxx e2) {
                Log.wtf("Places", "Exception whilst starting autocomplete activity", e2);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("last_query", this.g);
        bundle.putBoolean("is_activity_open", this.h);
        bundle.putParcelable("autocomplete_result", this.i);
        bundle.putParcelable("map_bounds", this.d);
    }
}
