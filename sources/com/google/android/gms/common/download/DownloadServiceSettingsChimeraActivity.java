package com.google.android.gms.common.download;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadServiceSettingsChimeraActivity extends bjs {
    static final DownloadDetails a;
    static final DownloadDetails b;
    public static final String[] c = {"_id", "text1", "text2"};
    public final Runnable d = new ipo(this);
    public Handler e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class DownloadServiceSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.common.download.DOWNLOAD_SETTINGS"), 2, "Download Service debug", 24);
            googleSettingsItem.g = true;
            googleSettingsItem.h = awud.a.a().i();
            return googleSettingsItem;
        }
    }

    static {
        ipm ipm = new ipm("__google_logo.jpg", "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", 5969, "1737d3dfb411c07b86ed8bd30f5987a4dc397cc1");
        ipm.e = "google_logo";
        a = ipm.a();
        ipm ipm2 = new ipm("__world_cup_day_1.jpg", "https://www.google.com/logos/doodles/2018/world-cup-2018-day-1-5741876039647232-2x.png", 760148, "df0d9c53a3fda7049209d47d9887c47e60d19ea4");
        ipm2.e = "worldcup_day_1";
        b = ipm2.a();
    }

    public static DownloadDetails e() {
        return awug.a.b().a() ? b : a;
    }

    public final void f() {
        new ipq(this).start();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = new ListView(this);
        listView.setId(16908298);
        setContentView((View) listView);
        setTitle((CharSequence) "Download Service debug");
        this.e = new qvr();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        ips ips = new ips(this);
        menu.add(0, 1, 0, "Start DownloadService Now").setOnMenuItemClickListener(ips);
        menu.add(0, 2, 0, "Enable file").setOnMenuItemClickListener(ips);
        menu.add(0, 3, 0, "Disable file").setOnMenuItemClickListener(ips);
        menu.add(0, 4, 0, "View file").setOnMenuItemClickListener(ips);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        f();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.e.removeCallbacks(this.d);
    }
}
