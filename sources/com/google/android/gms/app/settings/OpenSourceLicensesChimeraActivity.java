package com.google.android.gms.app.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenSourceLicensesChimeraActivity extends bjs {
    public static final amzy a = amzy.a(new Pair("com.google.android.ims", "Carrier Service"), new Pair("com.google.android.apps.pixelmigrate", "Data Transfer Tool"), new Pair("com.google.android.apps.restore", "Data Restore Tool"));
    public Handler b;
    public aoru c;
    public TextView d;

    public static void a(Context context, String str, StringBuilder sb, String str2) {
        InputStream openRawResource;
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            openRawResource = resourcesForApplication.openRawResource(resourcesForApplication.getIdentifier("third_party_licenses", "raw", str));
            sb.append(str2);
            sb.append(new Scanner(openRawResource).useDelimiter("\\A").next());
            if (openRawResource != null) {
                openRawResource.close();
                return;
            }
            return;
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | IOException e) {
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.common_activity_oss_licenses);
        TextView textView = (TextView) findViewById(R.id.text);
        this.d = textView;
        textView.setText(R.string.fetching_licenses);
        this.b = new drw(this);
        aoru b2 = jfm.b(10);
        this.c = b2;
        b2.execute(new drx(this));
        aE().b(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        iz.a(getContainerActivity());
        return true;
    }
}
