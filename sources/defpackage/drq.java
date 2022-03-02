package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;

/* renamed from: drq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class drq extends hde {
    public final void a(jma jma, Bundle bundle) {
        Intent intent = getIntent();
        if (intent.hasExtra("items")) {
            ArrayList b = ivy.b(intent, "items", GoogleSettingsItem.CREATOR);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) b.get(i);
                jmc b2 = hde.b((Context) this);
                b2.a((CharSequence) googleSettingsItem.d);
                b2.a(googleSettingsItem.b);
                b2.b((CharSequence) googleSettingsItem.i);
                b2.a(googleSettingsItem.j);
                int i2 = googleSettingsItem.e;
                if (i2 > 0) {
                    b2.a(i2);
                }
                ((jmz) jma).a.a(b2);
            }
        }
    }

    public final void i() {
        getIntent().getIntExtra("id", 0);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("title")) {
            setTitle((CharSequence) intent.getStringExtra("title"));
        }
    }
}
