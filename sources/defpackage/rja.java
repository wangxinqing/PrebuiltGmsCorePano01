package defpackage;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collections;
import java.util.List;

/* renamed from: rja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rja extends ilj implements rhf {
    private final String g() {
        return a("ap_description", "");
    }

    private final String h() {
        return a("ap_primary_text", "");
    }

    private final String i() {
        return a("ap_secondary_text", "");
    }

    private final List j() {
        return a("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    private final List k() {
        return a("ap_primary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    private final List l() {
        return a("ap_secondary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    public final CharSequence a(CharacterStyle characterStyle) {
        return rjd.a(h(), k(), characterStyle);
    }

    public final List b() {
        return j();
    }

    public final int c() {
        return a("ap_personalization_type", 6);
    }

    public final String d() {
        return a("ap_place_id", (String) null);
    }

    public final CharSequence e() {
        return rjd.a(g(), j(), (CharacterStyle) null);
    }

    public final CharSequence f() {
        return rjd.a(i(), l(), (CharacterStyle) null);
    }

    public rja(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return AutocompletePredictionEntity.a(d(), a("ap_place_types", Collections.emptyList()), c(), g(), j(), h(), k(), i(), l());
    }

    public final String a() {
        return g();
    }
}
