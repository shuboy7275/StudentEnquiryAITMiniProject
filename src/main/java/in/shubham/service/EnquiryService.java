package in.shubham.service;

import java.util.List;

import in.shubham.binding.DashboardResponse;
import in.shubham.binding.EnquiryForm;
import in.shubham.binding.EnquirySearchCriteria;
import in.shubham.entity.StudentEnqEntity;

public interface EnquiryService {

	public DashboardResponse getDashboardData(Integer userId);

	public List<String> getCourses();

	public List<String> getEnqStatuses();

	public boolean saveEnquiry(EnquiryForm form);

	public List<StudentEnqEntity> getEnquiries();
	
	public List<StudentEnqEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId);

}
