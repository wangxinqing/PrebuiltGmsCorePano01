package defpackage;

/* renamed from: axxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxu implements axxq {
    public static final agvx bearingKfMaxBackwardsJumpSec;
    public static final agvx bearingKfMaxGapBetweenUpdatesSec;
    public static final agvx bearingKfQSigmaBrgAccRadPerSec2;
    public static final agvx bearingKfQSigmaBrgRateRadPerSec;
    public static final agvx bearingKfThresholdVarianceThetaRadSquared;
    public static final agvx blueskyAdditionalClearcutLogging;
    public static final agvx blueskyBugreportLogExpirationTimeMinutes;
    public static final agvx blueskyBugreportLogSize;
    public static final agvx blueskyCheckPermissions;
    public static final agvx blueskyChipsetCorrectionTimeOfWeek;
    public static final agvx blueskyComputeProbLosForAllSats;
    public static final agvx blueskyComputeProbLosWithMinigrid;
    public static final agvx blueskyConstructLatLngKfAndBearingKfFromGcl;
    public static final agvx blueskyDisableWhenScreenOff;
    public static final agvx blueskyEnableBugreportLogs;
    public static final agvx blueskyEnableClearcutStats;
    public static final agvx blueskyEnableHardwareListener;
    public static final agvx blueskyEnableMddGeofence;
    public static final agvx blueskyEnabled;
    public static final agvx blueskyExtendGridCoveringFlpGnss;
    public static final agvx blueskyExtraBoundingRadiusToLoadGeodataMeters;
    public static final agvx blueskyInVehicleStickinessSec;
    public static final agvx blueskyIscbScaledDbhz;
    public static final agvx blueskyIscbUseGclValue;
    public static final agvx blueskyMaxGridRadiusMeters;
    public static final agvx blueskyMinTravelDistanceToComputeCorrectionsMeters;
    public static final agvx blueskyOnFootStickinessSec;
    public static final agvx blueskyOpenskyMinCn0DbhzForLos;
    public static final agvx blueskyOpenskyMinElevationDegForLos;
    public static final agvx blueskyOpenskyMinNumLosGnssSignals;
    public static final agvx blueskyOpenskyMinNumLosGpsSignals;
    public static final agvx blueskyRaytracingCalculationRadiusMeters;
    public static final agvx blueskyReportedSigmaMultiplier;
    public static final agvx blueskyS2Geofence;
    public static final agvx blueskySatelliteMotionFixB148574152;
    public static final agvx blueskySatelliteMotionThresholdDeg;
    public static final agvx blueskyScreenOffDisableTimeoutSec;
    public static final agvx blueskyTileCacheFixB149114011;
    public static final agvx blueskyTileDiskCacheSize;
    public static final agvx blueskyTileSize;
    public static final agvx blueskyTileVersion;
    public static final agvx blueskyTileZoomLevel;
    public static final agvx blueskyTreatUnknownActivityAsOnfoot;
    public static final agvx blueskyUpdateOnTinyMovement;
    public static final agvx blueskyUseGnssAsGridCenter;
    public static final agvx blueskyUseLocationCompat;
    public static final agvx blueskyUseRasterAltitudeForChipsetCorrection;
    public static final agvx blueskyUtcSecondsAtLeaps;
    public static final agvx blueskyWeightToGpsAccuracy;
    public static final agvx latLngKfBearingAccuracyRad;
    public static final agvx latLngKfInitVelocityUncertaintyMps;
    public static final agvx latLngKfMaxBackwardsJumpSec;
    public static final agvx latLngKfMaxGapBetweenUpdatesSec;
    public static final agvx latLngKfMeasurementErrorResetThresholdMeters;
    public static final agvx latLngKfQSigmaAccelWalkMps2;
    public static final agvx latLngKfSigmaVelThresholdMps;
    public static final agvx latLngKfSpeedAccuracyMps;
    public static final agvx minigridMinAllowedHorizontalPositionSigmaMeters;
    public static final agvx minigridNumberOfPointsInInnerCircle;
    public static final agvx minigridRadiusOfInnerCircleMeters;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bearingKfMaxBackwardsJumpSec = agvx.a(a, "Bluesky__bearing_kf_max_backwards_jump_sec", -2.0d);
        bearingKfMaxGapBetweenUpdatesSec = agvx.a(a, "Bluesky__bearing_kf_max_gap_between_updates_sec", 15.0d);
        bearingKfQSigmaBrgAccRadPerSec2 = agvx.a(a, "Bluesky__bearing_kf_q_sigma_brg_acc_rad_per_sec2", 0.261799d);
        bearingKfQSigmaBrgRateRadPerSec = agvx.a(a, "Bluesky__bearing_kf_q_sigma_brg_rate_rad_per_sec", 0.261799d);
        bearingKfThresholdVarianceThetaRadSquared = agvx.a(a, "Bluesky__bearing_kf_threshold_variance_theta_rad_squared", 9.8696d);
        blueskyAdditionalClearcutLogging = agvx.a(a, "Bluesky__bluesky_additional_clearcut_logging", false);
        blueskyBugreportLogExpirationTimeMinutes = agvx.a(a, "Bluesky__bluesky_bugreport_log_expiration_time_minutes", 10);
        blueskyBugreportLogSize = agvx.a(a, "Bluesky__bluesky_bugreport_log_size", 600);
        blueskyCheckPermissions = agvx.a(a, "Bluesky__bluesky_check_permissions", false);
        blueskyChipsetCorrectionTimeOfWeek = agvx.a(a, "Bluesky__bluesky_chipset_correction_time_of_week", false);
        blueskyComputeProbLosForAllSats = agvx.a(a, "Bluesky__bluesky_compute_prob_los_for_all_sats", false);
        blueskyComputeProbLosWithMinigrid = agvx.a(a, "Bluesky__bluesky_compute_prob_los_with_minigrid", true);
        blueskyConstructLatLngKfAndBearingKfFromGcl = agvx.a(a, "Bluesky__bluesky_construct_lat_lng_kf_and_bearing_kf_from_gcl", false);
        blueskyDisableWhenScreenOff = agvx.a(a, "Bluesky__bluesky_disable_when_screen_off", true);
        blueskyEnableBugreportLogs = agvx.a(a, "Bluesky__bluesky_enable_bugreport_logs", false);
        blueskyEnableClearcutStats = agvx.a(a, "Bluesky__bluesky_enable_clearcut_stats", true);
        blueskyEnableHardwareListener = agvx.a(a, "Bluesky__bluesky_enable_hardware_listener", false);
        blueskyEnableMddGeofence = agvx.a(a, "Bluesky__bluesky_enable_mdd_geofence", false);
        blueskyEnabled = agvx.a(a, "Bluesky__bluesky_enabled", false);
        blueskyExtendGridCoveringFlpGnss = agvx.a(a, "Bluesky__bluesky_extend_grid_covering_flp_gnss", false);
        blueskyExtraBoundingRadiusToLoadGeodataMeters = agvx.a(a, "Bluesky__bluesky_extra_bounding_radius_to_load_geodata_meters", 100);
        blueskyInVehicleStickinessSec = agvx.a(a, "Bluesky__bluesky_in_vehicle_stickiness_sec", 25);
        try {
            blueskyIscbScaledDbhz = agvx.a(a, "Bluesky__bluesky_iscb_scaled_dbhz", (auhz) aucj.a((aucj) auhz.b, new byte[]{10, 90, -24, -3, -1, -1, -1, -1, -1, -1, -1, 1, -114, -3, -1, -1, -1, -1, -1, -1, -1, 1, -96, -4, -1, -1, -1, -1, -1, -1, -1, 1, -28, -5, -1, -1, -1, -1, -1, -1, -1, 1, -34, -3, -1, -1, -1, -1, -1, -1, -1, 1, -8, -5, -1, -1, -1, -1, -1, -1, -1, 1, -8, -5, -1, -1, -1, -1, -1, -1, -1, 1, -94, -3, -1, -1, -1, -1, -1, -1, -1, 1, -88, -5, -1, -1, -1, -1, -1, -1, -1, 1}), axxr.a);
            blueskyIscbUseGclValue = agvx.a(a, "Bluesky__bluesky_iscb_use_gcl_value", true);
            blueskyMaxGridRadiusMeters = agvx.a(a, "Bluesky__bluesky_max_grid_radius_meters", 100);
            blueskyMinTravelDistanceToComputeCorrectionsMeters = agvx.a(a, "Bluesky__bluesky_min_travel_distance_to_compute_corrections_meters", 1.0d);
            blueskyOnFootStickinessSec = agvx.a(a, "Bluesky__bluesky_on_foot_stickiness_sec", 90);
            blueskyOpenskyMinCn0DbhzForLos = agvx.a(a, "Bluesky__bluesky_opensky_min_cn0_dbhz_for_los", 27.0d);
            blueskyOpenskyMinElevationDegForLos = agvx.a(a, "Bluesky__bluesky_opensky_min_elevation_deg_for_los", 30.0d);
            blueskyOpenskyMinNumLosGnssSignals = agvx.a(a, "Bluesky__bluesky_opensky_min_num_los_gnss_signals", 2);
            blueskyOpenskyMinNumLosGpsSignals = agvx.a(a, "Bluesky__bluesky_opensky_min_num_los_gps_signals", 1);
            blueskyRaytracingCalculationRadiusMeters = agvx.a(a, "Bluesky__bluesky_raytracing_calculation_radius_meters", 280);
            blueskyReportedSigmaMultiplier = agvx.a(a, "Bluesky__bluesky_reported_sigma_multiplier", 1.0d);
            try {
                blueskyS2Geofence = agvx.a(a, "Bluesky__bluesky_s2_geofence", (auia) aucj.a((aucj) auia.a, new byte[]{10, -93, 1, Byte.MIN_VALUE, -114, -106, -124, 8, Byte.MIN_VALUE, -126, -106, -124, 8, Byte.MIN_VALUE, -8, -67, -124, 8, Byte.MIN_VALUE, -24, -66, -124, 8, Byte.MIN_VALUE, -104, -65, -124, 8, -64, -13, -66, -124, 8, -64, -12, -66, -124, 8, Byte.MIN_VALUE, -24, -72, -124, 8, -64, -68, -13, -122, 8, Byte.MIN_VALUE, -120, -40, -61, 4, Byte.MIN_VALUE, -74, -40, -61, 4, Byte.MIN_VALUE, -70, -40, -61, 4, Byte.MIN_VALUE, -24, -117, -50, 8, Byte.MIN_VALUE, -72, -119, -50, 8, Byte.MIN_VALUE, -104, -95, -67, 4, Byte.MIN_VALUE, -88, -95, -67, 4, Byte.MIN_VALUE, -96, -24, -114, 3, Byte.MIN_VALUE, -32, -24, -114, 3, Byte.MIN_VALUE, Byte.MIN_VALUE, -101, -68, 4, Byte.MIN_VALUE, -32, -120, 106, Byte.MIN_VALUE, -96, -122, 106, Byte.MIN_VALUE, -32, -103, -65, 4, Byte.MIN_VALUE, -96, -71, -90, 9, Byte.MIN_VALUE, -32, -69, -90, 9, Byte.MIN_VALUE, -96, -30, Byte.MIN_VALUE, 6, Byte.MIN_VALUE, -32, -29, Byte.MIN_VALUE, 6, -80, -41, -118, -94, 3, -52, -41, -118, -94, 3, -57, -41, -118, -94, 3, -63, -41, -118, -94, 3, -116, -46, -118, -94, 3, -109, -46, -118, -94, 3, -16, -46, -118, -94, 3}), axxs.a);
                blueskySatelliteMotionFixB148574152 = agvx.a(a, "Bluesky__bluesky_satellite_motion_fix_b148574152", false);
                blueskySatelliteMotionThresholdDeg = agvx.a(a, "Bluesky__bluesky_satellite_motion_threshold_deg", 2.0d);
                blueskyScreenOffDisableTimeoutSec = agvx.a(a, "Bluesky__bluesky_screen_off_disable_timeout_sec", 60);
                blueskyTileCacheFixB149114011 = agvx.a(a, "Bluesky__bluesky_tile_cache_fix_b149114011", false);
                blueskyTileDiskCacheSize = agvx.a(a, "Bluesky__bluesky_tile_disk_cache_size", 100);
                blueskyTileSize = agvx.a(a, "Bluesky__bluesky_tile_size", 512);
                blueskyTileVersion = agvx.a(a, "Bluesky__bluesky_tile_version", 2);
                blueskyTileZoomLevel = agvx.a(a, "Bluesky__bluesky_tile_zoom_level", 19);
                blueskyTreatUnknownActivityAsOnfoot = agvx.a(a, "Bluesky__bluesky_treat_unknown_activity_as_onfoot", true);
                blueskyUpdateOnTinyMovement = agvx.a(a, "Bluesky__bluesky_update_on_tiny_movement", true);
                blueskyUseGnssAsGridCenter = agvx.a(a, "Bluesky__bluesky_use_gnss_as_grid_center", false);
                blueskyUseLocationCompat = agvx.a(a, "Bluesky__bluesky_use_location_compat", true);
                blueskyUseRasterAltitudeForChipsetCorrection = agvx.a(a, "Bluesky__bluesky_use_raster_altitude_for_chipset_correction", false);
                try {
                    blueskyUtcSecondsAtLeaps = agvx.a(a, "Bluesky__bluesky_utc_seconds_at_leaps", (auhz) aucj.a((aucj) auhz.b, new byte[]{10, 90, Byte.MIN_VALUE, -67, -55, -76, 1, Byte.MIN_VALUE, -4, -125, -68, 1, Byte.MIN_VALUE, -29, -120, -53, 1, Byte.MIN_VALUE, -44, -105, -23, 1, Byte.MIN_VALUE, -54, -21, -114, 2, Byte.MIN_VALUE, -69, -6, -84, 2, Byte.MIN_VALUE, -94, -1, -69, 2, Byte.MIN_VALUE, -21, -61, -46, 2, Byte.MIN_VALUE, -46, -56, -31, 2, Byte.MIN_VALUE, -71, -51, -16, 2, Byte.MIN_VALUE, -56, -100, -121, 3, Byte.MIN_VALUE, -111, -31, -99, 3, Byte.MIN_VALUE, -96, -80, -76, 3, Byte.MIN_VALUE, -73, -36, -99, 4, Byte.MIN_VALUE, -113, -16, -54, 4, Byte.MIN_VALUE, -90, -66, -1, 4, Byte.MIN_VALUE, -37, -52, -84, 5, Byte.MIN_VALUE, -115, -95, -61, 5}), axxt.a);
                    blueskyWeightToGpsAccuracy = agvx.a(a, "Bluesky__bluesky_weight_to_gps_accuracy", 0.1d);
                    latLngKfBearingAccuracyRad = agvx.a(a, "Bluesky__lat_lng_kf_bearing_accuracy_rad", 0.261799d);
                    latLngKfInitVelocityUncertaintyMps = agvx.a(a, "Bluesky__lat_lng_kf_init_velocity_uncertainty_mps", 1.5d);
                    latLngKfMaxBackwardsJumpSec = agvx.a(a, "Bluesky__lat_lng_kf_max_backwards_jump_sec", -2.0d);
                    latLngKfMaxGapBetweenUpdatesSec = agvx.a(a, "Bluesky__lat_lng_kf_max_gap_between_updates_sec", 15.0d);
                    latLngKfMeasurementErrorResetThresholdMeters = agvx.a(a, "Bluesky__lat_lng_kf_measurement_error_reset_threshold_meters", 250.0d);
                    latLngKfQSigmaAccelWalkMps2 = agvx.a(a, "Bluesky__lat_lng_kf_q_sigma_accel_walk_mps2", 1.0d);
                    latLngKfSigmaVelThresholdMps = agvx.a(a, "Bluesky__lat_lng_kf_sigma_vel_threshold_mps", 0.3d);
                    latLngKfSpeedAccuracyMps = agvx.a(a, "Bluesky__lat_lng_kf_speed_accuracy_mps", 0.9d);
                    minigridMinAllowedHorizontalPositionSigmaMeters = agvx.a(a, "Bluesky__minigrid_min_allowed_horizontal_position_sigma_meters", 3.0d);
                    minigridNumberOfPointsInInnerCircle = agvx.a(a, "Bluesky__minigrid_number_of_points_in_inner_circle", 4);
                    minigridRadiusOfInnerCircleMeters = agvx.a(a, "Bluesky__minigrid_radius_of_inner_circle_meters", 2.0d);
                } catch (auda e) {
                    throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_utc_seconds_at_leaps\"");
                }
            } catch (auda e2) {
                throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_s2_geofence\"");
            }
        } catch (auda e3) {
            throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_iscb_scaled_dbhz\"");
        }
    }

    public double bearingKfMaxBackwardsJumpSec() {
        return ((Double) bearingKfMaxBackwardsJumpSec.c()).doubleValue();
    }

    public double bearingKfMaxGapBetweenUpdatesSec() {
        return ((Double) bearingKfMaxGapBetweenUpdatesSec.c()).doubleValue();
    }

    public double bearingKfQSigmaBrgAccRadPerSec2() {
        return ((Double) bearingKfQSigmaBrgAccRadPerSec2.c()).doubleValue();
    }

    public double bearingKfQSigmaBrgRateRadPerSec() {
        return ((Double) bearingKfQSigmaBrgRateRadPerSec.c()).doubleValue();
    }

    public double bearingKfThresholdVarianceThetaRadSquared() {
        return ((Double) bearingKfThresholdVarianceThetaRadSquared.c()).doubleValue();
    }

    public boolean blueskyAdditionalClearcutLogging() {
        return ((Boolean) blueskyAdditionalClearcutLogging.c()).booleanValue();
    }

    public long blueskyBugreportLogExpirationTimeMinutes() {
        return ((Long) blueskyBugreportLogExpirationTimeMinutes.c()).longValue();
    }

    public long blueskyBugreportLogSize() {
        return ((Long) blueskyBugreportLogSize.c()).longValue();
    }

    public boolean blueskyCheckPermissions() {
        return ((Boolean) blueskyCheckPermissions.c()).booleanValue();
    }

    public boolean blueskyChipsetCorrectionTimeOfWeek() {
        return ((Boolean) blueskyChipsetCorrectionTimeOfWeek.c()).booleanValue();
    }

    public boolean blueskyComputeProbLosForAllSats() {
        return ((Boolean) blueskyComputeProbLosForAllSats.c()).booleanValue();
    }

    public boolean blueskyComputeProbLosWithMinigrid() {
        return ((Boolean) blueskyComputeProbLosWithMinigrid.c()).booleanValue();
    }

    public boolean blueskyConstructLatLngKfAndBearingKfFromGcl() {
        return ((Boolean) blueskyConstructLatLngKfAndBearingKfFromGcl.c()).booleanValue();
    }

    public boolean blueskyDisableWhenScreenOff() {
        return ((Boolean) blueskyDisableWhenScreenOff.c()).booleanValue();
    }

    public boolean blueskyEnableBugreportLogs() {
        return ((Boolean) blueskyEnableBugreportLogs.c()).booleanValue();
    }

    public boolean blueskyEnableClearcutStats() {
        return ((Boolean) blueskyEnableClearcutStats.c()).booleanValue();
    }

    public boolean blueskyEnableHardwareListener() {
        return ((Boolean) blueskyEnableHardwareListener.c()).booleanValue();
    }

    public boolean blueskyEnableMddGeofence() {
        return ((Boolean) blueskyEnableMddGeofence.c()).booleanValue();
    }

    public boolean blueskyEnabled() {
        return ((Boolean) blueskyEnabled.c()).booleanValue();
    }

    public boolean blueskyExtendGridCoveringFlpGnss() {
        return ((Boolean) blueskyExtendGridCoveringFlpGnss.c()).booleanValue();
    }

    public long blueskyExtraBoundingRadiusToLoadGeodataMeters() {
        return ((Long) blueskyExtraBoundingRadiusToLoadGeodataMeters.c()).longValue();
    }

    public long blueskyInVehicleStickinessSec() {
        return ((Long) blueskyInVehicleStickinessSec.c()).longValue();
    }

    public auhz blueskyIscbScaledDbhz() {
        return (auhz) blueskyIscbScaledDbhz.c();
    }

    public boolean blueskyIscbUseGclValue() {
        return ((Boolean) blueskyIscbUseGclValue.c()).booleanValue();
    }

    public long blueskyMaxGridRadiusMeters() {
        return ((Long) blueskyMaxGridRadiusMeters.c()).longValue();
    }

    public double blueskyMinTravelDistanceToComputeCorrectionsMeters() {
        return ((Double) blueskyMinTravelDistanceToComputeCorrectionsMeters.c()).doubleValue();
    }

    public long blueskyOnFootStickinessSec() {
        return ((Long) blueskyOnFootStickinessSec.c()).longValue();
    }

    public double blueskyOpenskyMinCn0DbhzForLos() {
        return ((Double) blueskyOpenskyMinCn0DbhzForLos.c()).doubleValue();
    }

    public double blueskyOpenskyMinElevationDegForLos() {
        return ((Double) blueskyOpenskyMinElevationDegForLos.c()).doubleValue();
    }

    public long blueskyOpenskyMinNumLosGnssSignals() {
        return ((Long) blueskyOpenskyMinNumLosGnssSignals.c()).longValue();
    }

    public long blueskyOpenskyMinNumLosGpsSignals() {
        return ((Long) blueskyOpenskyMinNumLosGpsSignals.c()).longValue();
    }

    public long blueskyRaytracingCalculationRadiusMeters() {
        return ((Long) blueskyRaytracingCalculationRadiusMeters.c()).longValue();
    }

    public double blueskyReportedSigmaMultiplier() {
        return ((Double) blueskyReportedSigmaMultiplier.c()).doubleValue();
    }

    public auia blueskyS2Geofence() {
        return (auia) blueskyS2Geofence.c();
    }

    public boolean blueskySatelliteMotionFixB148574152() {
        return ((Boolean) blueskySatelliteMotionFixB148574152.c()).booleanValue();
    }

    public double blueskySatelliteMotionThresholdDeg() {
        return ((Double) blueskySatelliteMotionThresholdDeg.c()).doubleValue();
    }

    public long blueskyScreenOffDisableTimeoutSec() {
        return ((Long) blueskyScreenOffDisableTimeoutSec.c()).longValue();
    }

    public boolean blueskyTileCacheFixB149114011() {
        return ((Boolean) blueskyTileCacheFixB149114011.c()).booleanValue();
    }

    public long blueskyTileDiskCacheSize() {
        return ((Long) blueskyTileDiskCacheSize.c()).longValue();
    }

    public long blueskyTileSize() {
        return ((Long) blueskyTileSize.c()).longValue();
    }

    public long blueskyTileVersion() {
        return ((Long) blueskyTileVersion.c()).longValue();
    }

    public long blueskyTileZoomLevel() {
        return ((Long) blueskyTileZoomLevel.c()).longValue();
    }

    public boolean blueskyTreatUnknownActivityAsOnfoot() {
        return ((Boolean) blueskyTreatUnknownActivityAsOnfoot.c()).booleanValue();
    }

    public boolean blueskyUpdateOnTinyMovement() {
        return ((Boolean) blueskyUpdateOnTinyMovement.c()).booleanValue();
    }

    public boolean blueskyUseGnssAsGridCenter() {
        return ((Boolean) blueskyUseGnssAsGridCenter.c()).booleanValue();
    }

    public boolean blueskyUseLocationCompat() {
        return ((Boolean) blueskyUseLocationCompat.c()).booleanValue();
    }

    public boolean blueskyUseRasterAltitudeForChipsetCorrection() {
        return ((Boolean) blueskyUseRasterAltitudeForChipsetCorrection.c()).booleanValue();
    }

    public auhz blueskyUtcSecondsAtLeaps() {
        return (auhz) blueskyUtcSecondsAtLeaps.c();
    }

    public double blueskyWeightToGpsAccuracy() {
        return ((Double) blueskyWeightToGpsAccuracy.c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public double latLngKfBearingAccuracyRad() {
        return ((Double) latLngKfBearingAccuracyRad.c()).doubleValue();
    }

    public double latLngKfInitVelocityUncertaintyMps() {
        return ((Double) latLngKfInitVelocityUncertaintyMps.c()).doubleValue();
    }

    public double latLngKfMaxBackwardsJumpSec() {
        return ((Double) latLngKfMaxBackwardsJumpSec.c()).doubleValue();
    }

    public double latLngKfMaxGapBetweenUpdatesSec() {
        return ((Double) latLngKfMaxGapBetweenUpdatesSec.c()).doubleValue();
    }

    public double latLngKfMeasurementErrorResetThresholdMeters() {
        return ((Double) latLngKfMeasurementErrorResetThresholdMeters.c()).doubleValue();
    }

    public double latLngKfQSigmaAccelWalkMps2() {
        return ((Double) latLngKfQSigmaAccelWalkMps2.c()).doubleValue();
    }

    public double latLngKfSigmaVelThresholdMps() {
        return ((Double) latLngKfSigmaVelThresholdMps.c()).doubleValue();
    }

    public double latLngKfSpeedAccuracyMps() {
        return ((Double) latLngKfSpeedAccuracyMps.c()).doubleValue();
    }

    public double minigridMinAllowedHorizontalPositionSigmaMeters() {
        return ((Double) minigridMinAllowedHorizontalPositionSigmaMeters.c()).doubleValue();
    }

    public long minigridNumberOfPointsInInnerCircle() {
        return ((Long) minigridNumberOfPointsInInnerCircle.c()).longValue();
    }

    public double minigridRadiusOfInnerCircleMeters() {
        return ((Double) minigridRadiusOfInnerCircleMeters.c()).doubleValue();
    }
}
