package project.jobs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.jobs.business.abstracts.UserPositionCompanyService;
import project.jobs.dataAccess.abstracts.UserPositionCompanyRepository;

import project.jobs.entities.concretes.UserPositionCompany;

@Service
public class UserPositionCompanyManager implements UserPositionCompanyService {

    private UserPositionCompanyRepository userCompanyPositionRepository;
    
    
    @Autowired
    public UserPositionCompanyManager(UserPositionCompanyRepository userCompanyPositionRepository) {
        this.userCompanyPositionRepository = userCompanyPositionRepository;
    }
    
    

    @Override
    public List<UserPositionCompany> getAll() {
        return userCompanyPositionRepository.findAll();
            }

    @Override
    public UserPositionCompany save(UserPositionCompany userPositionCompany) {
        return userCompanyPositionRepository.save(userPositionCompany);
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    private UserPositionCompanyRepository userPositionCompanyRepository;
//    private UserRepository userRepository;
//    private JobPositionRepository jobPositionRepository;
//    private CompanyRepository companyRepository;
//
//    @Autowired
//    public UserPositionCompanyManager(UserPositionCompanyRepository userPositionCompanyRepository,
//            UserRepository userRepository,
//            JobPositionRepository jobPositionRepository,
//            CompanyRepository companyRepository) {
//        super();
//        this.userPositionCompanyRepository = userPositionCompanyRepository;
//        this.userRepository = userRepository;
//        this.jobPositionRepository = jobPositionRepository;
//        this.companyRepository = companyRepository;
//    }
//
//    @Override
//    public DataResult<UserPositionCompany> addUserToPositionInCompany(Long userId, Long positionId, Long companyId) {
//        // User var mı kontrolü
//        User user = userRepository.findById(userId).orElse(null);
//        if (user == null) {
//            return new ErrorDataResult<>("User not found with id: " + userId);
//        }
//
//        // Position var mı kontrolü
//        JobPosition position = jobPositionRepository.findById(positionId).orElse(null);
//        if (position == null) {
//            return new ErrorDataResult<>("Position not found with id: " + positionId);
//        }
//
//        // Company var mı kontrolü
//        Company company = companyRepository.findById(companyId).orElse(null);
//        if (company == null) {
//            return new ErrorDataResult<>("Company not found with id: " + companyId);
//        }
//
//        // Yeni UserPositionCompany kaydını oluştur
//        UserPositionCompany userPositionCompany = new UserPositionCompany();
//        userPositionCompany.setUser(user);
//        userPositionCompany.setPosition(position);
//        userPositionCompany.setCompany(company);
//
//        userPositionCompanyRepository.save(userPositionCompany);
//
//        return new SuccessDataResult<>(userPositionCompany, "User successfully added to position in company.");
//    }
//
//    @Override
//    public DataResult<List<UserPositionCompany>> getUserPositions(Long userId) {
//        // Kullanıcının pozisyonlarını getir
//        List<UserPositionCompany> userPositions = userPositionCompanyRepository.findByUserId(userId);
//        if (userPositions.isEmpty()) {
//            return new ErrorDataResult<>("No positions found for user with id: " + userId);
//        }
//        return new SuccessDataResult<>(userPositions, "User positions retrieved successfully.");
//    }
}
