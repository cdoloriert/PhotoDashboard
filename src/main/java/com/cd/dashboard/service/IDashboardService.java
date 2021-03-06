package com.cd.dashboard.service;

import java.util.Set;

public interface IDashboardService {

	Set<String> getProcessedPhotos();

	Set<String> getUnprocessedPhotos();

	Set<String> getExceptions();

}