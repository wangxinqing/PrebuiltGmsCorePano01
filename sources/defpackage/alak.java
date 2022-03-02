package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.List;

/* renamed from: alak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alak extends ArrayAdapter {
    final /* synthetic */ alal a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alak(alal alal, Context context, List list) {
        super(context, R.layout.places_ui_suggestion_item, list);
        this.a = alal;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        alaj alaj;
        Bitmap bitmap;
        rhf rhf = (rhf) getItem(i);
        if (view == null) {
            view = this.a.getActivity().getLayoutInflater().inflate(R.layout.places_ui_suggestion_item, this.a.b, false);
            alaj = new alaj();
            alaj.b = (ImageView) view.findViewById(R.id.place_suggestion_icon);
            alaj.c = (TextView) view.findViewById(R.id.place_suggestion_description);
            alaj.d = view.findViewById(R.id.list_divider);
            view.setTag(alaj);
        } else {
            alaj = (alaj) view.getTag();
        }
        alaj.a = rhf;
        ImageView imageView = alaj.b;
        akyr akyr = this.a.f;
        int c = rhf.c();
        if (c != 1) {
            bitmap = c != 2 ? c != 5 ? !TextUtils.isEmpty(rhf.d()) ? akyr.g : akyr.e : akyr.f : akyr.d;
        } else {
            bitmap = akyr.c;
        }
        imageView.setImageBitmap(bitmap);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rhf.a());
        for (AutocompletePredictionEntity.SubstringEntity substringEntity : rhf.b()) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(getContext(), R.style.SuggestionHighLightedText);
            int i2 = substringEntity.a;
            spannableStringBuilder.setSpan(textAppearanceSpan, i2, substringEntity.b + i2, 33);
        }
        alaj.c.setText(spannableStringBuilder);
        if (i == getCount() - 1) {
            alaj.d.setVisibility(8);
        } else {
            alaj.d.setVisibility(0);
        }
        return view;
    }
}
