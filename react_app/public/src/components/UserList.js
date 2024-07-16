import axios from 'axios';
import React, { useEffect, useState } from 'react';
const UserList = () => {
    const [users, setUsers] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8080/api/users')
            .then(response => {
                setUsers(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the users!', error);
            });
    }, []);
    return (
        <div>
            <h1>User List</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>{user.username}</li>
                ))}
            </ul>
        </div>
    );
};
export default UserList;