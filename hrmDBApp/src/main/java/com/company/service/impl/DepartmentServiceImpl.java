import com.company.dao.impl.DepartmentRepository;
import com.company.dao.impl.JobRepository;
import com.company.entity.Departments;
import com.company.entity.Jobs;
import com.company.service.inter.DepartmentServiceInter;
import com.company.service.inter.JobServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentServiceInter {


    @Autowired

    private DepartmentRepository entityDao;


    @Override
    public List<Departments> getAll() {
        return entityDao.getAll();
    }

    @Override
    public Departments getById(int id) {
        return entityDao.findById(id);
    }

    @Override
    public boolean addDepartments(Departments u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean updateDepartments(Departments u) {
        entityDao.save(u);
        return true;
    }

    @Override
    public boolean removeDepartments(Integer id) {
        entityDao.deleteById(id);
        return true;    }
}