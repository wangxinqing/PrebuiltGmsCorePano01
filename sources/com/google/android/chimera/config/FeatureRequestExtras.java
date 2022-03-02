package com.google.android.chimera.config;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ChimeraApiVersion(added = 107)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeatureRequestExtras {
    public static final int DOWNLOAD_RESULT_ERROR = 1;
    public static final int DOWNLOAD_RESULT_FAILURE = 2;
    public static final int DOWNLOAD_RESULT_OFFLINE = 4;
    public static final int DOWNLOAD_RESULT_TIMEOUT = 3;
    public static final int DOWNLOAD_RESULT_USER_CANCELED = 5;

    @ChimeraApiVersion(added = 107)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public @interface DownloadResult {
    }

    @ChimeraApiVersion(added = 107)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RequestBuilder {
        private String a;

        private final Bundle a() {
            Bundle bundle = new Bundle(2);
            bundle.putString("session_id", this.a);
            return bundle;
        }

        public void addToBundle(Bundle bundle) {
            bundle.putBundle("chimera.feature_request_bundle", a());
        }

        public void addToIntent(Intent intent) {
            intent.putExtra("chimera.feature_request_bundle", a());
        }

        public RequestBuilder setSessionId(String str) {
            this.a = str;
            return this;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RequestReader {
        private final Bundle a;

        public RequestReader(Intent intent) {
            this.a = intent.getBundleExtra("chimera.feature_request_bundle");
        }

        public String getSessionId() {
            Bundle bundle = this.a;
            if (bundle != null) {
                return bundle.getString("session_id");
            }
            return null;
        }

        public boolean hasFeatureRequest() {
            return this.a != null;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ResultBuilder {
        private int a;

        public void addToIntent(Intent intent) {
            Bundle bundle = new Bundle();
            bundle.putInt("download_status", this.a);
            intent.putExtra("chimera.feature_response_bundle", bundle);
        }

        public ResultBuilder setDownloadResult(int i) {
            this.a = i;
            return this;
        }
    }

    @ChimeraApiVersion(added = 107)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ResultReader {
        private final Bundle a;

        private ResultReader(Bundle bundle) {
            this.a = bundle;
        }

        public static ResultReader fromIntent(Intent intent) {
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("chimera.feature_response_bundle") : null;
            if (bundleExtra != null) {
                return new ResultReader(bundleExtra);
            }
            return null;
        }

        public int getDownloadResultCode() {
            return this.a.getInt("download_status", 1);
        }
    }
}
