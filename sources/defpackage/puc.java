package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/* renamed from: puc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class puc implements View.OnClickListener {
    public pux a;
    private final Context b;

    public puc(Context context) {
        this.b = context;
    }

    public void onClick(View view) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        intent.putExtra("query", this.a.a);
        Bundle bundle = new Bundle();
        if ("Person".equals(this.a.g)) {
            bundle.putString("package_name", "com.google.android.gms");
            bundle.putString("corpus", "contacts_contact_id");
        } else {
            intent.putExtra("ipa_package_name", this.a.e);
            bundle.putString("package_name", this.a.e);
            bundle.putString("corpus", this.a.f);
        }
        intent.putExtra("phone_search_param_bundle", bundle);
        intent.putExtra("search_within_corpus", "phone");
        intent.setFlags(268435456);
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            oso.e("com.google.android.googlequicksearchbox.GOOGLE_SEARCH can not be found to execute the search Intent");
            Toast.makeText(this.b, "com.google.android.googlequicksearchbox.GOOGLE_SEARCH can not be found to execute the search Intent", 1).show();
        }
    }
}
