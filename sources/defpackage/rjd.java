package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: rjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjd {
    public static CharSequence a(String str, List list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutocompletePredictionEntity.SubstringEntity substringEntity = (AutocompletePredictionEntity.SubstringEntity) it.next();
            CharacterStyle wrap = CharacterStyle.wrap(characterStyle);
            int i = substringEntity.a;
            spannableString.setSpan(wrap, i, substringEntity.b + i, 0);
        }
        return spannableString;
    }

    public static String a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return TextUtils.join(", ", collection);
    }
}
